package com.zn.test;

import java.util.ArrayList;

public class Test {

	private static int i = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList<Integer> list = new ArrayList<Integer>();
		//
		// list.add(12);
		// list.add(22);
		//
		// Integer[] array = list.toArray(new Integer[list.size()]);

		Test t1 = new Test();
		t1.i++;

		Test t2 = new Test();
		t2.i++;

		System.out.println(t2.i);

		t1 = new Test();
		t1.i++;

		Test.i--;

		System.out.println("i=" + i);
		
		try
        {
            aMethod(0);
        }
        catch (Exception ex)
        {
            System.out.printf("exception in main");
        }
        System.out.printf("finished");

	}

	
	public static int aMethod(int i)throws Exception
    {
        try{
            return i / 10;
        }
        catch (Exception ex)
        {
            throw new Exception("exception in a Method");
        } finally{
            System.out.printf("finally");
        }
    }
}
