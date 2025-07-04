package com.binary.search;


//Greatest number that is smaller or equal to target
public class Floor {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 5, 9, 14, 16, 18 };
		System.out.println("=> " + floor(arr, 15)); // 4 se chota ho, aur 4 ke pas ho i.e 3 will be the ans
	}

	static int floor(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		if (target > arr[end]) {
			return -1;
		}

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target == arr[mid]) {
				return mid;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return end;
	}

}
