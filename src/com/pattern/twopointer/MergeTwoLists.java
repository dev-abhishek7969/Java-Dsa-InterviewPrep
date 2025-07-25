package com.pattern.twopointer;

import com.pattern.twopointer.util.ListNode;

/**
 * Input: list1 = [1,2,4], list2 = [1,3,4] Output: [1,1,2,3,4,4]
 * 
 * @author abhishek.kumar2
 *
 */
public class MergeTwoLists {

	public static void main(String[] args) {

	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		ListNode returnNode = new ListNode(Integer.MIN_VALUE);
		
		ListNode headNode = returnNode;
		
		while(l1 != null && l2 != null){
			if(l1.val <= l2.val) {
				returnNode.next= l1;
				l1=l1.next;
			}
			else {
				returnNode.next=l2;
				l2=l2.next;
			}
			
			returnNode = returnNode.next;			
		}

		if(l1 == null) {
			returnNode.next=l2;
		}
		else if(l2 == null) {
			returnNode.next=l1;
		}
		return headNode;
	}

}
