package com.zn.java8.lambda;

import java.util.function.Consumer;

import com.zn.bean.User;

public class ConsumerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Consumer<User> consumer = (User u) -> {
			u.setPassword("123");
			u.setUsername("defaultname");
		};
		
		User user = new User();
		consumer.accept(user);
		
		
		
	}

}
