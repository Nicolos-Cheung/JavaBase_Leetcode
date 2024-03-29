package com.zn.oom;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * —Xms100m  -Xmx100m  -XX:UseSerialGC
 * @author ning
 *
 */
public class OOMObject {

	public byte[] placeholder = new byte[64 * 1024];

	public static void fillheap(int num) throws InterruptedException {

		List<OOMObject> list = new ArrayList<OOMObject>();

		for (int i = 0; i < num; i++) {
			Thread.sleep(50);
			list.add(new OOMObject());
		}
		System.gc();
	}

	public static void main(String[] args) throws InterruptedException {

		fillheap(1000);
	}

}
