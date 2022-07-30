package com.suresh.arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		//three ways to define the array...

		int[] arr1 = {1,2,3,4,5,6,7,8,9,10}; //declaration, instantiation and initialization  
		
		int[] arr2 = new int[] {1,2,3,4,5,6,7,8,9,10};//declaration, instantiation and initialization  

		int []arr3 = new int[10];//declaration, instantiation   
		
		//initialization  
		
		arr3[0] = 1;
		arr3[1] = 2;
		arr3[2] = 3;
		arr3[3] = 4;
		arr3[4] = 5;
		arr3[5] = 6;
		arr3[6] = 7;
		arr3[7] = 8;
		arr3[8] = 9;
		arr3[9] = 10;
		//arr3[10] =10;
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " " );
		}
	}

}
