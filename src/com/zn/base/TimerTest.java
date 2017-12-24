package com.zn.base;

import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Timer t = new Timer();
		t.schedule(new Task(), 0, 5000); 

		System.out.println("started");

	}

}

class Task extends TimerTask {

	@Override
	public void run() {
		System.out.println(System.currentTimeMillis());
	}

}