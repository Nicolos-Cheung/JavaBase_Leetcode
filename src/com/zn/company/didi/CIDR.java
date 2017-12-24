package com.zn.company.didi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class CIDR {

	private static Scanner cin;

	public static void main(String[] args) {
		cin = new Scanner(System.in);
		int count = cin.nextInt();
		ArrayList<IP> list = new ArrayList<IP>();
		int index = 0;
		while (index < count) {
			String line = cin.nextLine();
			if (line == null || line.equals("")) {
				continue;
			}
			String[] split = line.split("/");
			IP ip = new IP(split[0], Integer.valueOf(split[1]));
			list.add(ip);
			index++;
		}

		System.out.println(list.get(0).ips[1]);

		Collections.sort(list, new Comparator<IP>() {
			@Override
			public int compare(IP ip1, IP ip2) {
				// TODO Auto-generated method stub
				if (ip1.num != ip2.num)
					return ip1.num - ip2.num;
				else
					return ip1.ip.compareTo(ip2.ip);
			}
		});

		// CIDR去重

		for (int i = 0; i < list.size(); i++) {

			for (int j = i + 1; j < list.size(); j++) {

				if (list.get(i).isCover(list.get(j))) {
					list.remove(j);
				}
			}
		}

		System.out.println(list.size());
		for (IP ip : list) {
			System.out.println(ip.ip + "/" + ip.num);
		}
	}
}

class IP {

	public String ip;
	public int num;
	public int[] ips = new int[4];

	public IP(String ip, int num) {
		super();
		this.ip = ip;
		this.num = num;

		String[] split = ip.split(".");
		for (int i = 0; i < ips.length; i++) {
			ips[i] = Integer.valueOf(split[i]);
		}

	}

	// 判断是否可以把传入ip覆盖
	public boolean isCover(IP ip) {
		if (this.num > ip.num) {
			return false;
		}
		int a = this.num / 8;
		int b = this.num % 8;

		int index = 0;
		for (index = 0; index < a + 1; index++) {
			if (this.ips[index] != ip.ips[index]) {
				return false;
			}
		}

		int w = ((this.ips[index]) >> (8 - b)) ^ ((ip.ips[index]) >> (8 - b));
		if (w == 0) {
			return true;
		}
		return false;
	}

}
