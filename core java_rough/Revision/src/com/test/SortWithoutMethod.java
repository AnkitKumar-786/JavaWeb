package com.test;

public class SortWithoutMethod {

	public static void main(String[] args) {
		
		int[] arr = new int[] {12,23,34,45,56,67,78,89,90};
		
		System.out.println("Sorted array in ascending order is:");
		
		for(int i=0; i< arr.length; i++);
		{
			int i = 0;
			for(int j= i+1; j< arr.length; j++);
			{
				int tmp = 0;
				
					int j = 0;
					if(arr[i]> arr[j])
					{
				 tmp = arr[i];
				 arr[i] = arr[j];
				arr[j] = tmp;
				}
		}
			System.out.println(arr[i]);

	   }
	}
}


