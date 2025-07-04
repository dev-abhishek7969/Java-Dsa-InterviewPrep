package com.binary.search;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = { 23, 25, 26, 27, 28, 29 };
		System.out.println("=> " + binarySearch(arr, 28));
	}

	public static int binarySearch(int arr[], int target) {

		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}

		return -1;
	}
}
