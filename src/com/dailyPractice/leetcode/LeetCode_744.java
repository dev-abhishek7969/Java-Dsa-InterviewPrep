package com.dailyPractice.leetcode;

public class LeetCode_744 {

	public static void main(String[] args) {
	    char[] charArray = {'a', 'h', 'k', 'n'};
		System.out.println(nextGreatestLetter(charArray, 'l'));
		
	}

	/**
	 * Input: letters = ["c","f","j"], target = "c" Output: "f" Explanation: The
	 * smallest character that is lexicographically greater than 'c' in letters is
	 * 'f'.
	 * 
	 * @param letters
	 * @param target
	 * @return
	 */

	public static char nextGreatestLetter(char[] letters, char target) {
		int start = 0;
		int end = letters.length-1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target > letters[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return letters[start % (letters.length)];
	}

}
