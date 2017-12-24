package com.zn.test.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializeTest {

	public static void main(String[] args) {

		// 创建一个User对象
		User user = new User();
		user.setId(1);
		user.setName("Mr XP.Wang");
		// 创建一个List对象
		List<String> list = new ArrayList<String>();
		list.add("My name");
		list.add(" is");
		list.add(" Mr XP.Wang");

//		serialize(list, "/Users/ning/Downloads/a.class");
		List deserialize = deserialize(List.class, "/Users/ning/Downloads/a.class");
		ArrayList list1 = (ArrayList) deserialize;
		
		System.out.println(list.size());
		

	}

	public static void serialize(Object obj, String path) {

		// 序列化
		try {
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(path));
			os.writeObject(obj);// 将User对象写进文件
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static <T> T deserialize(Class<T> tClass, String path) {
		ObjectInputStream is = null;
		try {
			is = new ObjectInputStream(new FileInputStream(path));
			T obj = (T) is.readObject();// 从流中读取数据
			return obj;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

}
