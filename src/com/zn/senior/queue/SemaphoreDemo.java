package com.zn.senior.queue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreDemo {

	public static void main(String[] args) {

		ExecutorService exec = Executors.newCachedThreadPool();

		Semaphore semp = new Semaphore(2); //信号量中维护了2个许可证
		
//		强制公平性，以当许可证被释放后，其他线程获得许可证的顺序是它们最初尝试获取许可证的顺序，即先按照调用acquire方法的顺序分配许可证
//		强制公平会影响并发性能，如果没有特殊要求，推荐使用非公平的模式
//		Semaphore semp = new Semaphore(2,true);
		
		//模拟并发获取许可证
		for (int index = 0; index < 5; index++) {
			Runnable run = new Runnable() {

				@Override
				public void run() {
					try {
						System.out.println(Thread.currentThread().getName() + "尝试获取许可证");
						
						semp.acquire();
						System.out.println(Thread.currentThread().getName() + "已获得许可证");
						
						Thread.sleep(1000);

						System.out.println(Thread.currentThread().getName() + "释放许可证");
						semp.release();

					} catch (Exception e) {
					}
				}
			};
			exec.execute(run);
		}
		exec.shutdown();//关闭线程池
		
	}
}
