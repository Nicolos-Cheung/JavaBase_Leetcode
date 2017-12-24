package com.zn.java8.lambda;

import java.util.function.Predicate;

public class PredicateTest {
	
	public static void main(String []args){
		
		
		String str = "123456";
		Predicate<String> p = (String s)->s.length()>0;
		Predicate<String> p2 = (String s)->s.length()<5;
		
		boolean result = p.negate().and(p2).test(str); 
		System.out.println(result);
	}


}
