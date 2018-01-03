package com.zn.base;

public class MatchTest {
	
	public static void main(String []args){
		
		String regex = ".*((明星侵权.*明星肖像|明星肖像.*明星侵权)|234|345).*";
		String str = "【明星侵权】--明星肖像";
		System.out.println(str.matches(regex));
	}
	

}
