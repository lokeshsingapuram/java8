package com.tcs.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamTest4 {
public static void main(String[] args) {
	List<Integer> l=new ArrayList<Integer>();
	l.add(10);
	l.add(0);
	l.add(98);
	l.add(67);
	l.add(34);
	System.out.println(l);
	System.out.println("find the min value in given list");
	Integer min = l.stream().min((i1,i2)->i1.compareTo(i2)).get();
	System.out.println(min);
	System.out.println("find the max value in given list");
	Integer max = l.stream().max((i1,i2)->i1.compareTo(i2)).get();
	System.out.println(max);
	System.out.println();
	l.forEach(entity->{
		System.out.println(entity);
	});
	System.out.println();
	l.forEach(System.out::println);
}
}
