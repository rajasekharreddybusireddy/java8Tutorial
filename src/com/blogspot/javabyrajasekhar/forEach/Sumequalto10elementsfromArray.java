package com.blogspot.javabyrajasekhar.forEach;

import java.util.stream.IntStream;

public class Sumequalto10elementsfromArray {

	public static void main(String[] args) {

		Integer []arr=new Integer[100];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
		}
		
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==10) {
					System.out.println("("+arr[i]+","+arr[j]+")");
				}
			}
		}
		
	}

}
