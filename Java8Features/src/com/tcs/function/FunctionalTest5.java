
//Function Chaining
package com.tcs.function;

import java.util.function.Function;

public class FunctionalTest5 {

	public static void main(String[] args) {
		
		Function<String, String> f1=s->s.toUpperCase();
		Function<String, String>f2=s1->s1.substring(0, 6);
		System.out.println(f1.apply("Lokesh Babu"));
		System.out.println(f2.apply("lokesh babu"));
		System.out.println(f1.andThen(f2).apply("Lokesh Babu"));
		System.out.println(f1.compose(f2).apply("Lokesh Babu"));
	}
}
