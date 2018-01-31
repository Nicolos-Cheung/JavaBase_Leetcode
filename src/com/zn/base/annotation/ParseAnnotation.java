package com.zn.base.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ParseAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class c = Class.forName("com.zn.base.annotation.Test");
			if (c.isAnnotationPresent(Description.class)) {
				// 存在Description注解->拿到注解实例
				Description annotation = (Description) c.getAnnotation(Description.class);
				System.out.println(annotation.desc());
			}
			// 找到方法上的注解
			Method[] ms = c.getMethods(); //private方法无法找到
			for (Method m : ms) {
				if (m.isAnnotationPresent(Description.class)) {
					Description annotation = (Description) m.getAnnotation(Description.class);
					System.out.println(annotation.desc());
				}
			}
			
			//另一种整体解析方式：
			Annotation[] annotations = c.getAnnotations();
			for(Annotation a:annotations){
				if(a instanceof Description){
					Description d = (Description)a;
					System.out.println(d.desc());
				}
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
