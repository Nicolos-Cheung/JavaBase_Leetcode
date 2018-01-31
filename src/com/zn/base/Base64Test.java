package com.zn.base;

import java.util.Base64;

public class Base64Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "北京-海淀";
		String enstr = Base64.getEncoder().encodeToString(str.getBytes());
		String destr = new String(Base64.getDecoder().decode(enstr));
		System.out.println(enstr+" : "+destr);
		
	}

}
