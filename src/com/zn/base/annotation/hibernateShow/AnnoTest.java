 package com.zn.base.annotation.hibernateShow;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 
 * hibernate 注解原理
 * 
 * @author ning
 *
 */
public class AnnoTest {

	public static void main(String[] args) {

		User user1 = new User();
		user1.setId(123);
		user1.setUsername("zn");
		user1.setEmail("nicolos@foxmail.com,349719588@qq.com");

		String sql = query(user1);

	}

	private static String query(Object object) {

		StringBuilder sb = new StringBuilder();
		Class<? extends Object> c = object.getClass();
		boolean isExist = c.isAnnotationPresent(Table.class);

		if (!isExist) {
			return null;
		}
		Table t = c.getAnnotation(Table.class);
		System.out.println(t.value()); // 表名
		sb.append("SELECT * FROM ").append(t.value()).append(" WHERE 1=1 ");

		Field[] fields = c.getDeclaredFields();
		for (Field f : fields) {
			
			// 处理每个字段对应的sql
			boolean fexist = f.isAnnotationPresent(Column.class);
			if (!fexist) {
				continue;
			}
			Column column = f.getAnnotation(Column.class);
			String columeName = column.value();
			String fieldName = f.getName();
			String methodName = "get" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);

			Object fieldValue = null;

			try {
				Method method = c.getMethod(methodName);
				fieldValue = method.invoke(object);

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// 拼装sql - fieldValue
			if (fieldValue == null || (fieldValue instanceof Integer && (Integer) fieldValue == 0)) {
				continue;
			}

			sb.append(" AND ").append(fieldName);

			if (fieldValue instanceof String) {
				if (((String) fieldValue).contains(",")) {
					
					String[] split = ((String) fieldValue).split(",");
					sb.append(" IN (");
					for(String s:split){
						sb.append("'").append(s).append("'").append(",");
					}
					sb.deleteCharAt(sb.length()-1);
					sb.append(")");
					
				} else {
					sb.append("=").append("'").append(fieldValue).append("'");
				}
			} else if (fieldValue instanceof Integer) {
				sb.append("=").append(fieldValue);
			}

		}
		sb.append(";");
		System.out.println(sb.toString());
		return sb.toString();

	}

}
