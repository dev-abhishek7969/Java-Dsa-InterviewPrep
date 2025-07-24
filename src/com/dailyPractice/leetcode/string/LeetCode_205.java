package com.dailyPractice.leetcode.string;

import java.util.HashMap;
import java.util.Map;

/**
 * isIsomorphic Input: s = "badc", t = "baba"
 * 
 * Output: true
 */
public class LeetCode_205 {

	public static void main(String[] args) {
		System.out.println(isIsomorphic("bbbaaaba", "aaabbbba"));

	}

	public static boolean isIsomorphic(String s, String t) {

		Map<Character, Character> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			Character original = s.charAt(i);
			Character replace = t.charAt(i);

			if (!map.containsKey(original)) {
				if (!map.containsKey(replace)) {
					map.put(original, replace);
				} 
				else {
					
				}
			} else {
				Character mapped = map.get(original);
				if (mapped != replace) {
					return false;
				}
			}

		}

		return true;
	}

}
