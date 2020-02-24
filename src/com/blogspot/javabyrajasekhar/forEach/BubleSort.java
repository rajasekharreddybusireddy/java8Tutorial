package com.blogspot.javabyrajasekhar.forEach;

import java.util.Arrays;

public class BubleSort {

	public static void main(String[] args) {

		int arr[]= {8,66,-7,6,3,9,1};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {				
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;				}
				
			}
			
		}
		
		Arrays.stream(arr).forEach(System.out::println);
		//System.out.println(arr);
	}

}
