package com.blogspot.javabyrajasekhar.forEach;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SameElementsFromBothLists {
	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(3, 6, 1, 9, 10, 77, 53);
		List<Integer> b = Arrays.asList(10, 53, 28, 6, 2);

		a.stream().forEach(e -> {
			b.stream().filter(f -> e == f).forEach(System.out::println);
		});

		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		a.stream().forEach(e -> {
			hashMap.put(e, 1);
		});
System.out.println("=======================");
		b.stream().forEach(f->{
			if(hashMap.containsKey(f)) {
				System.out.println(f);
			}
		});
	}
}
