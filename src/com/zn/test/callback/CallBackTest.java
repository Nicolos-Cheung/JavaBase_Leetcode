package com.zn.test.callback;

public class CallBackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Answerer a = new Answerer();
		
		Questioner q = new Questioner(a);
		
		q.askQuestion("请问...");;
		
	}

}
