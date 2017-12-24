package com.zn.company.baidu;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);

		int m = cin.nextInt();
		int n = cin.nextInt();

		int arr[][] = new int[m][m];

		switch (n) {
		case 1:
			int index = 0;
			int step = 1;
			while (index < m) {
				if (index % 2 == 0) {

					for (int i = 0; i < m; i++) {
						arr[index][i] = step;
						step++;
					}

				} else {
					for (int i = m - 1; i >= 0; i--) {
						arr[index][i] = step;
						step++;
					}
				}
				index++;
			}

			break;
		case 2:
			int index1 = 0;
			int step1 = 1;
			while (index1 < m) {
				if (index1 % 2 == 0) {
					for (int i = 0; i < m; i++) {
						arr[i][index1] = step1;
						step1++;
					}
				} else {
					for (int i = m - 1; i >= 0; i--) {
						arr[i][index1] = step1;
						step1++;
					}
				}
				index1++;

			}
			break;

		case 3:

			break;
		default:
			break;
		}

		for(int i=0;i<m;i++){
			
			for(int j=0;j<m;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
		
		
	}

}
