package com.zn.company.meituan;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		int sum = cin.nextInt();

		int[] arr = new int[sum];

		int j = 0;
		while (j < sum) {
			arr[j] = cin.nextInt();
			j++;
		}

		int index = 0;
		boolean flag = false;
		while (flag == false) {
			flag = false;
			for (int i = 0; i < sum; i++) {
				if (arr[i] == 1) {
					flag = true;
					index++;

					for (int x = i; x < sum; x++) {
						arr[x] = arr[x] == 1 ? 0 : 1;
					}
					
					i = 0;

				}

			}
		}
		
		if(index%2==0){
			System.out.println("Bob");
		}else{
			System.out.println("Alice");
		}

	}

}
