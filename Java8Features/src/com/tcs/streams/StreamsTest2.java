package com.tcs.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest2 {
public static void main(String[] args) {
	List<String> l=new ArrayList<String>();
	l.add("lokesh babu");
	l.add("harish");
	l.add("reddy kiran");
	l.add("jayanna");
	l.add("prasanth reddy");
	List<String> l2 = l.stream().filter(s->s.length()>=9).collect(Collectors.toList());
	System.out.println(l2);
	List<String> l3 = l.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
	System.out.println(l3);
	long count = l.stream().filter(s->s.length()>=9).count();
	System.out.println("names who are having length 9::"+count);
}
}
