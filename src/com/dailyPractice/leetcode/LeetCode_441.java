package com.dailyPractice.leetcode;

public class LeetCode_441 {

	public static void main(String[] args) {
		System.out.println("---" + arrangeCoins(2147483647));
	}

	public static long arrangeCoins(int n) {

		long i = 1;
		long steps = 0;
		long ans = 0;

		while (steps < n) {
			steps = steps + i;
			ans = i;
			i = i + 1;
		}

		if (steps != n) {
			return (int) ans - 1;
		}

		return (int) ans;
	}

}
