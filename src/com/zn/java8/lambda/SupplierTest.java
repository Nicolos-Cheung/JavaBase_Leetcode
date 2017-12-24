package com.zn.java8.lambda;

import java.util.function.Supplier;

import com.zn.bean.User;

public class SupplierTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Supplier<User> s = () -> new User("zn", "123456");
		User user = s.get();
		
		//() -> new User()  可以通过方法引用中的构造方法引用来简化：
		Supplier<User> s1 = User::new;   //仅限无参构造方法
		User user2 = s1.get();
	}

}
