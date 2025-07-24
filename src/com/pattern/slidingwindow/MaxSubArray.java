package com.pattern.slidingwindow;

public class MaxSubArray {

	/**
	 * Given an integer array nums, find the subarray with the largest sum, and
	 * return its sum.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

	}

	public int maxSubArray(int[] nums) {
		int maxSum = nums[0];
		int currentSum = 0;

		for (int i = 0; i < nums.length; i++) {
			if (currentSum < 0) {
				currentSum = 0;
			}
			currentSum = currentSum + nums[i];
			maxSum = Math.max(currentSum, maxSum);
		}

		return maxSum;
	}

}
