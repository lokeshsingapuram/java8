package com.tcs.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamTest5 {
public static void main(String[] args) {
	List<Integer> l=new ArrayList<Integer>();
	l.add(10);
	l.add(0);
	l.add(98);
	l.add(67);
	l.add(34);
	System.out.println(l);
	Integer[] intArr = l.stream().toArray(Integer[]::new);
	for(Integer ir:intArr) {
		System.out.println(ir);
	}
	
}
}
