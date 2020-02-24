package com.blogspot.javabyrajasekhar.forEach;

import java.util.Arrays;
import java.util.List;

public class SortAnListWithoutUsingbuiltinfunctions {

	public static void main(String[] args) {

		List<Integer> list=Arrays.asList(58,2,5,1,8,32);
		
Integer[] array = (Integer[]) list.toArray();
		
		for(int i=0;i<array.length-1;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					Integer t=array[j];
					Integer temp=array[i];
					array[i]=t;
					array[j]=temp;
				}
			}
		}
		
		
		Arrays.stream(array).forEach(System.out::println);
		//list.stream().forEach(System.out::println);
	}

}
