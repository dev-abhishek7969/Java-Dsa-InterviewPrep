package com.dailyPractice.leetcode;

public class LeetCode_34 {

	public static void main(String[] args) {

		int[] nums = {5,7,7,8,8,10};
		
		System.out.println(searchRange(nums, 8));
	}

	/**
	 * Input: nums = [5,7,7,8,8,10], target = 8 Output: [3,4]
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] searchRange(int[] nums, int target) {

		int[] ans = { -1, -1 };
		int start = search(nums, target, true);
		int end = search(nums, target, false);
		ans[0] = start;
		ans[1] = end;
		return ans;
	}

	private static int search(int[] nums, int target, boolean findStart) {
		int start = 0;
		int end = nums.length - 1;
		int ans = -1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target < nums[mid]) {
				end = mid - 1;
			} else if (target > nums[mid]) {
				start = mid + 1;
			} else {
				ans = mid;
				if (findStart) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}

		return ans;
	}

}
