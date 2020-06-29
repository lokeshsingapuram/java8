//Difference between andThen, compose
package com.tcs.function;

import java.util.function.Function;

public class FunctionTest6 {

	public static void main(String[] args) {

		Function<Integer, Integer> add= i->i+i;
		Function<Integer, Integer> cube=i->i*i*i;
		System.out.println("Addition::"+add.apply(10));
		System.out.println("cube::"+cube.apply(10));
		System.out.println("andThen::"+add.andThen(cube).apply(10));
		System.out.println("compose::"+add.compose(cube).apply(10));
		
	}

}
