package com.pattern.twopointer.util;

public class ListNode {
	public int val;
	public ListNode next;

	public ListNode() {
	}

	public ListNode(int val) {
		this.val = val;
	}

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
	
	public int getLength(ListNode node) {
		int len = 0;
		while(node != null) {
			len++;
			node = node.next;
		}
		return len;
	}
}
