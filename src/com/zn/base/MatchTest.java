package com.zn.base;

public class MatchTest {
	
	public static void main(String []args){
		
		String regex = ".*(123|234|345).*";
		String str = "1245";
		System.out.println(str.matches(regex));
	}
	

}
