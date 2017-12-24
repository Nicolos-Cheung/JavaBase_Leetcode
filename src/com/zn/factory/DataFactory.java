package com.zn.factory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.UUID;

import com.zn.bean.LinkNode;
import com.zn.bean.TreeNode;

public class DataFactory {

	/**
	 * @param arr
	 * @return
	 */
	public static LinkNode getLinkDate(int[] arr) {

		LinkNode head = new LinkNode(arr[0]);
		LinkNode temp = head;
		for (int i = 1; i < arr.length; i++) {

			temp.next = new LinkNode(arr[i]);
			temp = temp.next;
		}

		return head;
	}

	public static TreeNode getTree(int[] arr) {

		if (arr == null || arr.length == 0) {
			return null;
		}
		TreeNode root = new TreeNode(arr[0]);

		Queue<TreeNode> queue = new LinkedList<TreeNode>();

		queue.add(root);
		int index = 1;

		while (queue.size() > 0 && index < arr.length) {

			TreeNode poll = queue.poll();

			if (index < arr.length && arr[index] != -1) {
				poll.left = new TreeNode(arr[index]);
				queue.add(poll.left);
			}

			index++;
			if (index < arr.length && arr[index] != -1) {
				poll.right = new TreeNode(arr[index]);
				poll.right = new TreeNode(arr[index]);
				queue.add(poll.right);
			}
			index++;

		}

		return root;
	}

	/**
	 * 等长度不同内容
	 * 
	 * @param num
	 * @return
	 */
	public static List<String> getStringList(int num) {

		List<String> l = new ArrayList();

		for (int i = 0; i < num; i++) {

			l.add("list_data_" + i);
		}

		return l;
	}

	/**
	 * 非等长List
	 * 
	 * @param num
	 * @return
	 */
	public static List<String> getStringList2(int num) {
		List<String> l = new ArrayList();
		StringBuilder sb = new StringBuilder();
		sb.append("z_");

		for (int i = 0; i < num; i++) {

			sb.append(i);
			l.add(sb.toString());

		}
		return l;

	}
	
	
	public static List<String> getRandomUUIDList(int num){
		
		List<String> l = new ArrayList();
		for(int i=0;i<num;i++){
			l.add(UUID.randomUUID().toString());
		}
		return l;
		
	}

}
