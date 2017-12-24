package com.zn.java8.lambda;

import java.util.function.Function;

public class FunctionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "12345";
		Function<String,Integer> f = (String s)->Integer.parseInt(s);
		Integer i = f.apply(str);
		
		Function<Integer,Integer> f1 = (Integer i1)->i1*3;
		Function<Integer,Integer> f2 = (Integer i2)->i2*i2;
	    Integer result = f1.compose(f2).apply(2);//先算f2 再把结果带入f1
	    System.out.println(result);  //12
		
	    Integer result1 = f1.andThen(f2).apply(2);//先算f1 再把结果带入f2
	    System.out.println(result1); //36
	    
	}

}
