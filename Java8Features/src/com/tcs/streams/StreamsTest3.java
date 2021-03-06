package com.tcs.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest3 {
public static void main(String[] args) {
	List<Integer> l=new ArrayList<Integer>();
	l.add(10);
	l.add(0);
	l.add(98);
	l.add(67);
	l.add(34);
	System.out.println(l);
	List<Integer> l2 = l.stream().sorted().collect(Collectors.toList());
System.out.println("ASC order"+l2);
List<Integer> l3 = l.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
System.out.println("desc order"+l3);
}
}
