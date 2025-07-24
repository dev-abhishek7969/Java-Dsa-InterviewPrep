package com.pattern.twopointer;

import com.pattern.twopointer.util.ListNode;

public class GetIntersectionNodeInLinkedList {

	public static void main(String[] args) {

		
	}

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		int a = getListLength(headA);
		int b = getListLength(headB);
		
		while(a>b) {
			headA=headA.next;
			a--;
		}
		while(b>a) {
			b--;
			headB=headB.next;
		}
		while(headA != headB) {
			headA = headA.next;
			headB = headB.next;  
		}
		
		return headB;

	}
	
	private int getListLength(ListNode head) {
	    int len = 0;
	    while (head != null) {
	      len++;
	      head = head.next;
	    }
	    return len;
	  }
}
