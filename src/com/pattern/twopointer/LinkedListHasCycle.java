package com.pattern.twopointer;

import com.pattern.twopointer.util.ListNode;

public class LinkedListHasCycle {

	public static void main(String[] args) {

	}

	public boolean hasCycle(ListNode head) {
		ListNode slowPtr = head;
		ListNode fastPtr = head;

		while (null != fastPtr && null != fastPtr.next) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;

			if (slowPtr == fastPtr) {
				return true;
			}
		}

		return false;

	}

}
