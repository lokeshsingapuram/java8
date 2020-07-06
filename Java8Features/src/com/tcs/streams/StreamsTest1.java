package com.tcs.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest1 {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(30);
		l.add(34);
		l.add(35);
		l.add(23);
		l.add(43);
		System.out.println("Given List");
		System.out.println(l);
		System.out.println("print even numbers from given list");
		List<Integer> l1=l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l1);
		System.out.println("double each and every number in given list");
		List<Integer> l2=l.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(l2);
	}

}
