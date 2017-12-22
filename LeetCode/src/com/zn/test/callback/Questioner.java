package com.zn.test.callback;

/**
 * 提问者
 * 
 * @author ning
 *
 */
public final class Questioner implements CallBack {

	/**
	 * 回答者对象的引用
	 */
	private Answerer answerer;

	public Questioner(Answerer answerer) {
		this.answerer = answerer;
	}

	public void askQuestion(final String question) {

		// 这里用一个线程就是异步，
		new Thread(new Runnable() {
			@Override
			public void run() {

				System.out.println("发起问答请求...");
				/**
				 * 提问者调用回答者中的方法，在这里注册回调接口 这就相当于A类调用B的方法C
				 */
				answerer.executeMessage(Questioner.this, question);

			}
		}).start();

		// 做其他事
		play();
	}

	private void play() {

		System.out.println("Questioner playing xxx...");
	}

	/**
	 * 回调方法
	 */
	@Override
	public void solve(String result) {

		System.out.println("回答者告诉提问者的答案是--->" + result);
	}

}
