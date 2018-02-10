package com.zn.senior.queue;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
	
	public static void main(String[] args) {
		
		CountDownLatch cdl = new CountDownLatch(3);
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("等待CountDownLatch计数器值减到0");
				try {
					cdl.await(); //等待CountDownLatch计数器值减到0
					System.out.println("线程被唤醒"); //当CountDownLatch计数器为0时，该线程会被唤醒，继续向下执行。
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}					
			}
		}).start();
		
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(cdl.getCount()>0){
					cdl.countDown();
					System.out.println("CountDownLatch计数器值-1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
}
