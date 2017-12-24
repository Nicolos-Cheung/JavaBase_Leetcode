package com.zn.leetcode;

/**
 * 判断一个单向链表中是否有环
 * 
 * @author ning
 *
 */
public class LinkedListCycle {

	public boolean hasCycle(ListNode head) {

		ListNode fast = head;
		ListNode slow = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return true;
			}
		}

		return false;

	}
}
