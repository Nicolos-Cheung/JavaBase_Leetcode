package com.zn.test.callback;

/**
 * 这是一个回调接口
 * 
 * @author ning
 * 
 */
public interface CallBack {

	/**
	 * 回答者--->通过调用的函数告诉提问者，也就是回调函数
	 * 
	 * @param result
	 *            答案
	 */
	public void solve(String result);
}
