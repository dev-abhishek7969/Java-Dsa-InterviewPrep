package com.dailyPractice.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Intersection of Two array
 * 
 * @author abhishek.kumar2
 *
 */
public class LeetCode_349 {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };

		intersection(nums1, nums2);

	}

	public static int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> res = new HashSet<>();

		List<Integer> numsList1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
		List<Integer> numsList2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());
		for (Integer integer : numsList1) {
			if (numsList2.contains(integer)) {
				res.add(integer);
			}
		}
		int[] ans = new int[res.size()];
		int j = 0;
		for (int i : res) {
			ans[j++] = i;
		}

		return ans;
	}

}
