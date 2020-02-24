package com.blogspot.javabyrajasekhar.forEach;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DuplicateIntegers2 {

	public static void main(String[] args) {
		Integer arr[]= {13,41,11,6,3,2,2,3,3,11,88};
		Arrays.sort(arr);
		HashMap<Integer, Integer> hashMap = new HashMap<Integer,Integer>();
		Arrays.stream(arr).forEach(e->hashMap.put(e, 1));
		
		HashSet<Integer> hashSet = new HashSet<>();
		 for (int i=0; i<100 ;i++) {
				if(hashMap.containsKey(i)) {
					hashMap.put(i, hashMap.get(i)+1);
				}else {
					hashMap.put(i, 1);
					//hashSet.add(i);
				}
		}
		 
		 
		// hashSet.stream().forEach(System.out::print);
		// System.out.println(hashSet);
	//Arrays.stream(arr).filter(predicate)
		Set<Integer> keySet = hashMap.keySet();
		keySet.stream().filter(e->hashMap.get(e)==1).forEach(System.out::println);
	}

}
