package com.zn.java8;

/**
 * JAVA8新特性接口可以有默认方法和静态方法
 * 
 * @author ning
 *
 */
public interface Interfacetest {

	/**
	 * 默认方法的特点：
	 * 1、所有实现类会自动继承接口的默认方法
	 * 2、实现类可以重写接口的默认方法
	 * 默认方法的好处：
	 * 1、无需修改接口的实现类实现类，即可为接口添加新的方法实现
	 */
	default void test() {
		System.out.println("默认方法");
	}
	
	public static void test1(){
		System.out.println("静态方法");
	}

}
