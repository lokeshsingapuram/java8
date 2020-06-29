package com.tcs.consumer;

import java.util.function.Consumer;

public class ConsumerProgram1 {

	public static void main(String[] args) {
		Consumer<String> c=c1->{
			String c2=c1.toUpperCase();
		System.out.println(c2);	
		};
		c.accept("lokesh");
	}
}
