package com.zn.company.meituan;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int init = scan.nextInt();
		
		int des = scan.nextInt();
		
		if(des-init>180){
			System.out.println("-"+(360-(des-init)));
		}else{
			System.out.println(Math.abs(des-init));
		}


	}

	private static String judge(int[] arr) {

		Arrays.sort(arr);

		int sum = 0;
		for (int i = 0; i < arr.length - 1; i++) {

			sum += arr[i];

		}
		if (arr[arr.length - 1] <= sum) {

			return "Yes";
		}

		return "No";
	}

}
