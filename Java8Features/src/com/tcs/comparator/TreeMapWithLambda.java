package com.tcs.comparator;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapWithLambda {

	public static void main(String[] args) {
		Map<Integer, String> map=new TreeMap<Integer,String>((o1,o2)->{
			return (o1>o2) ? -1 :(o1<o2) ? +1 : 0;
		});
		map.put(100, "lokesh");
		map.put(200, "gouri");
		map.put(600,"suman");
		map.put(860, "nick");
		map.put(830, "jones");
		System.out.println(map);
	}
}
