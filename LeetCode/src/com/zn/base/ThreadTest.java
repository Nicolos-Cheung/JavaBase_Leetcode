package com.zn.base;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThreadTest {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FutureTask<Integer> task = new FutureTask<Integer>(new CallableTest());

		Thread t = new Thread(task);
		t.start(); // 启动线程
		// task.cancel(true); // 取消线程
		Integer in = task.get();
	}
}

class CallableTest implements Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		System.out.println("thread run...");
		return 1;
	}
}