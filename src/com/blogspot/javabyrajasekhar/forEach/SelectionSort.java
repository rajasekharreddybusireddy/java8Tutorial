package com.blogspot.javabyrajasekhar.forEach;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int arr[]= {8,66,-7,6,3,9,1};
		
		for(int i=0;i<arr.length-1;i++) {
			int counter=i;
			for(int j=i+1;j<arr.length;j++) {				
				if(arr[counter]>arr[j]) {
					 counter=j;
				}
				
			}
			int temp=arr[i];
			arr[i]=arr[counter];
			arr[counter]=temp;
		}
		
		Arrays.stream(arr).forEach(System.out::println);
		//System.out.println(arr);
	}

}
