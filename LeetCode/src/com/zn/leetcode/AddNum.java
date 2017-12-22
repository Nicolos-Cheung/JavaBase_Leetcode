package com.zn.leetcode;

public class AddNum {
	
	public static void main(String []args){
		
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(3);
		l1.next.next =  new ListNode(4);
		
		
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(1);
		l2.next.next =  new ListNode(1);
		
		ListNode l3 = addTwoNumbers(l1, l2);
		
		System.out.println(l3.val+"--"+l3.next.val);
	}

	 public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        
	        ListNode head = new ListNode(l1.val+l2.val);
	        ListNode point = head ;
	        boolean temp = false; 
	        
	        while(l1.next!=null &&l2.next !=null){
	            l1 = l1.next;
	            l2 = l2.next;
	            
	            if(temp){
	            	point.next = new ListNode(1);
	            }else{
	            	point.next = new ListNode(0);
	            }
	            point.next.val += l1.val+l2.val;
	            
	            if(l1.val+l2.val>10){
	            	point.next.val -=10;
	            }
	            
	            point = point.next;
	            
	        }
	        if(l1.next!=null ||l2.next!=null){

	            point.next = l1.next!=null? new ListNode(l1.next.val):new ListNode(l2.next.val);
	        }
	        
	        return head;
	    }
}

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }