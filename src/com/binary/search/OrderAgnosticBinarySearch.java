package com.binary.search;

public class OrderAgnosticBinarySearch {

	public static void main(String[] args) {
		int arrAsc[] = { -18,-12,-4,0,2,3,4,15,16,18,22,45,89};
		int arrDesc[] = {99,80,75,22,11,10,5,2,-3};

		System.out.println("=> " + OrderAgnosticBs(arrDesc, 8));

	}

	public static int OrderAgnosticBs(int arr[], int target) {
		int start = 0;
		int end = arr.length - 1;
		boolean isAsc = false;

		// find whether the array is sorted in asc or descending
		if (arr[start] <= arr[end]) {
			isAsc = true;
		}

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target == arr[mid]) {
				return mid;
			}

			if (isAsc) {
				if (target < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (target > arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}

		}

		return -1;
	}

}
