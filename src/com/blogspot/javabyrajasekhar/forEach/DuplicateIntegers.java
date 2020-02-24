package com.blogspot.javabyrajasekhar.forEach;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateIntegers {

	public static void main(String[] args) {
		System.out.println(cal());
	}

	private static int cal() {
		int A[]= {1,0,1};
		Integer[] boxed=Arrays.stream(A).boxed().toArray(Integer[]::new);
		HashMap<Integer, Integer> hashMap = new HashMap<Integer,Integer>();
		 for (Integer integer : boxed) {
				if(!hashMap.containsKey(integer)) {
					hashMap.put(integer, 1);
				}else {
					hashMap.put(integer, hashMap.get(integer)+1);
				}
		}
		
		 
	//Arrays.stream(arr).filter(predicate)
		Set<Integer> keySet = hashMap.keySet();
		keySet.stream().filter(e->hashMap.get(e)==1).forEach((e)->System.out.println(e+"-"+hashMap.get(e)));
		
		  List<Integer> collect = keySet.stream().filter(e->hashMap.get(e)==1).collect(Collectors.toList());
		  return 0;
	}

	
	
}
