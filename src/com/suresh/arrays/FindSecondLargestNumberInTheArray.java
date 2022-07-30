package com.suresh.arrays;

public class FindSecondLargestNumberInTheArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,33,222,11};
		
		findSecondlaargest(arr);
		
	}

	private static void findSecondlaargest(int[] arr) {
		
		int high = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>high) {
				secondHighest = high;
				high = arr[i];
			}else if(arr[i]>secondHighest && arr[i]!=high) {
				secondHighest = arr[i];
			}
		}
		System.out.println(secondHighest);
	}
}
