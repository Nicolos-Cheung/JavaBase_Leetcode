package com.zn.company.jd;

import java.util.Scanner;
import java.util.Stack;

public class BracketSplitPlan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {

			String nextLine = cin.nextLine();
			char[] arrs = nextLine.toCharArray();

			if (arrs.length == 0) {

				
				System.out.println(0);
			}

			int sum = 1;

			Stack<Character> all = new Stack<Character>();
			for (int i = 0; i < arrs.length; i++) {
				all.push(arrs[i]);
			}

			Stack<Character> right = new Stack<Character>();
			int rightsize = 0;
			while (!all.isEmpty()) {
				if (all.pop() == ')') {
					rightsize++;
				} else {
					sum *= rightsize;
					rightsize--;
				}

			}
			System.out.println(sum);
		}

	}

	static int factorial(int n) {

		int result = 1;
		while (n > 1) {

			result *= n;
			n--;
		}

		return result;
	}

}
