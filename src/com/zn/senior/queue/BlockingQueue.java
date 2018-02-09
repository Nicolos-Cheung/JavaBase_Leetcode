package com.zn.senior.queue;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 线程安全的阻塞队列 --当队列满时put操作进行阻塞等待(wait) --当队列空时get操作进行阻塞等待(wait)
 *
 * 使用synchronized wait notify实现。
 * 
 * @author ning
 *
 */
public class BlockingQueue {

	private List<String> queue = new ArrayList<String>();

	private Object lock = new Object();

	private int maxsize;

	public BlockingQueue(int maxsize) {
		this.maxsize = maxsize;
	}

	public String get() {
		synchronized (lock) {

			if (this.queue.size() == 0) {

				try {
					System.out.println(Thread.currentThread().getName() + "获取元素时队列为空，等待中...");
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			String result = queue.remove(0);
			System.out.println(Thread.currentThread().getName() + "获取元素:" + result);
			lock.notifyAll();
			return result;

		}
	}

	public void put(String element) {

		synchronized (lock) {

			if (this.queue.size() == maxsize) {

				try {
					System.out.println(Thread.currentThread().getName() + "添加元素时队列满，等待中...");

					lock.wait();

				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			this.queue.add(element);
			System.out.println(Thread.currentThread().getName() + "添加元素:" + element);
			lock.notifyAll();

		}
	}
}
