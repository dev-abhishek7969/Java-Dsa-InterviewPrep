package com.pattern.twopointer;

/**
 * Given sorted array
 * Input: nums = [2,7,11,15], target = 9 Output: [0,1]
 *
 */
public class TwoSum {

	public static void main(String[] args) {
		int nums[] = {2,3,4};
		System.out.println(twoSum(nums, 6));
	}

	public static int[] twoSum(int[] nums, int target) {
		int first = 0;
		int last = nums.length-1;
		while(first < last) {
			int sum = nums[first]+nums[last];
			
			if(sum == target) {
				break;
			}
			else if(sum > target) {
				last --;
			}
			else {
				first++;
			}
		}
		System.out.println(first+"---"+last);
		return new int[] {first,last} ;
	}

}
