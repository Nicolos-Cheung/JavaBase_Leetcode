package com.zn.test;

public class Test2 {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		Test2 t = new Test2();
		t.setName("zn");

		Object o = t;

		Test2 t1 = (Test2) o;

		System.out.println(t1.getName());

	}

}
