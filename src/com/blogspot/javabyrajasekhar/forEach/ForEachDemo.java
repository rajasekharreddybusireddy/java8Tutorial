package com.blogspot.javabyrajasekhar.forEach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ForEachDemo {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("raja", 10);
		map.put("ravi", 36);
		map.put("anil", 40);
		map.put("bharath", 49);
		map.put("mani", 20);
		map.put("naren", 11);
		map.put("reddy", 51);

		System.out.println("before java 8  -------");
		System.out.println("---------------------------------------------------------");
		for (Map.Entry<String, Integer> myentry : map.entrySet()) {
			System.out.println(myentry.getKey() + " :" + myentry.getValue());
		}

		System.out.println("---------------------------------------------------------");

		System.out.println("by using java 8       -------");

		map.forEach((k, v) -> System.out.println(k + "=" + v));

		System.out.println("----------------------------foreach for list-----------------------------");

		List<String> list = new ArrayList<String>();

		list.add("aa");
		list.add("cc");
		list.add("bb");
		list.add("dd");
		list.add("ee");

		System.out.println("=============================before java 8  foreach list -------");
		for (String string : list) {
			System.out.println(string);
		}

		System.out.println("=============================using java 8  foreach list-------");
		list.stream().forEach((e) -> System.out.println(e));

		Set<String> set = new HashSet<String>();
		set.add("aa");
		set.add("cc");
		set.add("bb");
		set.add("dd");
		set.add("ee");

		System.out.println("=============================before java 8 foreach  -------");
		for (String string : set) {
			System.out.println(string);
		}

		System.out.println("=============================using java 8 foreach  -------");
		set.stream().forEach(e -> System.out.println(e));

	}

}
