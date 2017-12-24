package com.zn.leetcode;

public class RemoveNthNode {

	
	public class Solution {
	    public ListNode removeNthFromEnd(ListNode head, int n) {
	        
	        ListNode headNode = new ListNode(0);
	        headNode.next = head;
	        ListNode fastNode = headNode;
	        ListNode slowNode = headNode;
	        while(fastNode.next != null){
	        	if(n <= 0)
	        		slowNode = slowNode.next;
	        	fastNode = fastNode.next;
	        	n--;
	        }
	        if(slowNode.next != null)
	        	slowNode.next = slowNode.next.next;
	        return headNode.next;
	    }
	}
	
}
