package com.suresh.arrays;

public class FindLargestSmallestNumber {

	public static void main(String[] args) {
		 
		int[] arr = {1,4,5,6,2,19,0};
		findLargeAndSmall(arr);
	}

	private static void findLargeAndSmall(int[] arr) {
		
		int min = arr[0];
		int max = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}else if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("minimum "  +min);
		System.out.println("maximum "  +max);
	}

}
