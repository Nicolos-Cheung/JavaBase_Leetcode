package com.zn.data_structure.linkedlist;

import com.zn.bean.LinkNode;
import com.zn.factory.DataFactory;

public class LinkReverse {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

		LinkNode head = DataFactory.getLinkDate(arr);

		head = reverse(head);

		while (head != null) {

			System.out.println(head.data);
			head = head.next;

		}

	}

	public static LinkNode reverse(LinkNode head) {

		if (head == null)
			return head;
		LinkNode pre = head;// 上一结点
		LinkNode cur = head.next;// 当前结点
		LinkNode tmp; // 临时结点，用于保存当前结点的指针域（即下一结点）
		while (cur != null) {// 当前结点为null，说明位于尾结点
			tmp = cur.next;
			cur.next = pre;// 反转指针域的指向

			// 指针往下移动
			pre = cur;
			cur = tmp;
		}
		// 最后将原链表的头节点的指针域置为null，还回新链表的头结点，即原链表的尾结点
		head.next = null;

		return pre;
	}

}
