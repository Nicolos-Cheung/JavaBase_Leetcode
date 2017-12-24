package com.zn.company.huawei;

public class Main2 {

	//报数出队问题，最后队列剩m个人
	 public static void main(String[] args) {
	
	 String str = "abcdefg";
	 char[]arr = new char[1024];
	 NumberOffGame(4,str.toCharArray());
	
	 }

	private static void NumberOffGame(int m, char[] output) {

		int[] arr = new int[100];
		for (int i = 0; i < 100; i++) {
			arr[i] = i + 1;
		}

		int currentlen = arr.length;

		if (m <= 1 || m >= 100) {
			System.out.println("ERROR");
		} else {
			int i = 0;
			int step = 0;
			while (currentlen >= m) {
				i = i % arr.length;
				if (arr[i] != -1) {
					step++;
				} else {

				}
				if (step == m) {
					arr[i] = -1;
					currentlen--;
					step = 0;
				}
				i++;

			}

		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != -1) {
				sb.append(arr[i]);
				sb.append(',');
			}
		}
		sb.deleteCharAt(sb.length() - 1);
		
		output = sb.toString().toCharArray();

		System.out.println(sb.toString());
	}
}
