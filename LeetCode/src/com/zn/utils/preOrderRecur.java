package com.zn.utils;

import com.zn.bean.TreeNode;

public class preOrderRecur {

	private TreeNode head;

	public void preOrderRecur(TreeNode head) {
		this.head = head;
	}

	public void getOrder() {
		StringBuilder sb = new StringBuilder();
		if (head == null) {
			return;
		}
		System.out.println(head.val);
		preOrderRecur(head.left);
		preOrderRecur(head.right);
	}


}
