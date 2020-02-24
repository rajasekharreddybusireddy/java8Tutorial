package com.blogspot.javabyrajasekhar.forEach;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[]= {8,66,-7,6,3,9,1};
		for(int i=1;i<arr.length;i++) {
			for(int j=i;j>=0;j--) {	
				if(arr[i]>arr[j]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;	
				}
			}
			}
		
		Arrays.stream(arr).forEach(System.out::println);
	}

}
