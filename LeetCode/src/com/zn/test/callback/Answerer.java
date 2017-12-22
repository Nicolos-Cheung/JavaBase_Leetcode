package com.zn.test.callback;

public class Answerer {

	public void executeMessage(Questioner questioner, String question) {

		try {

			// 模拟思考...
			Thread.sleep(1000);
			
			String result = "答案是：....此处省略1w字";

			questioner.solve(result);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
