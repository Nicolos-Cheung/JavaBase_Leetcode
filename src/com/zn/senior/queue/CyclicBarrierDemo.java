package com.zn.senior.queue;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//import java.util.concurrent.TimeUnit;


public class CyclicBarrierDemo {

	public static void main(String[] args) {

		CyclicBarrier barrier = new CyclicBarrier(3);

		ExecutorService executor = Executors.newFixedThreadPool(3);

		executor.submit(new Thread(new Runner(barrier, "No1 runner")));
		executor.submit(new Thread(new Runner(barrier, "No2 runner")));
		executor.submit(new Thread(new Runner(barrier, "No3 runner")));
		
		executor.shutdown();
	}

}

class Runner implements Runnable {
	
	//允许一组线程互相等待，直到到达某个公共屏障点,多个线程需要使用相同的barrier
	private CyclicBarrier barrier;
	private String name;
	
	public Runner(CyclicBarrier barrier,String name){
		super();
		this.barrier = barrier;
		this.name = name;
	}

	@Override
	public void run() {
		
		try {
			Thread.sleep(1000*(new Random().nextInt(8))); //随机等待一段时间
			System.out.println(name+"就绪");
			barrier.await();//就绪
			//barrier.await(1, TimeUnit.SECONDS);//超过1s,如果最后一个线程没有就位，则自己继续运行，会导致Barrier被标记已破坏
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(name+"---run!");

	}

}