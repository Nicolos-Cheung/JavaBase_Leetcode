package com.zn.base.annotation;

/**
 * 
 * @Override---覆盖了父类的注解
 * @Deprecated---过时注解
 * @Suppvisewarings---忽略警告注解
 * 
 * @author ning
 *
 */

@Description(desc = "class annotation", author = "zn")
public class Test {

	@Description(desc = "method annotation", author = "zn")
	public void method() {
		
	}
}
