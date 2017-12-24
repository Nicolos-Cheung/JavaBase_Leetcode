package com.zn.base;

import java.util.Arrays;

public class StreamTest {
	
	public static void main(String[]args){
		
		int []a = {1,20,3,231,21,4 ,64,58,98,7,65,2};
		
		int b[] = Arrays.stream(a).filter(x->x>50).toArray();
		
		System.out.println(b.length);
	}

}
