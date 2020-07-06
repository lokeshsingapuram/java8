package com.tcs.streams;

import java.util.stream.Stream;

public class StreamTest6 {
public static void main(String[] args) {
	Stream<Integer> s=Stream.of(99,87,23,45);
	s.forEach(System.out::println);
	Double[] d= {10.0,10.1,10.2,10.3};
	Stream<Double> db=Stream.of(d);
	db.forEach(System.out::println);
}
}
