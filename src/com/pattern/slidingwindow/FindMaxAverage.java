package com.pattern.slidingwindow;

public class FindMaxAverage {

	public static void main(String[] args) {

	}

	public double findMaxAverage(int[] nums, int k) {

		int windowSum = 0;
		for (int i = 0; i < k; i++) {
			windowSum = windowSum + nums[i];
		}
		int maxSum = windowSum;

		int startIndex = 0;
		int endIndex = k;

		while (endIndex < nums.length) {
			windowSum = windowSum - nums[startIndex];
			startIndex++;

			windowSum = windowSum + nums[endIndex];
			endIndex++;
			maxSum = Math.max(maxSum, windowSum);
		}

		return (double) maxSum / k;
	}

}
