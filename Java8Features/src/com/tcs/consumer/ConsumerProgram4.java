//consumer chaining
package com.tcs.consumer;

import java.util.function.Consumer;

public class ConsumerProgram4 {
public static void main(String[] args) {
	Consumer<String> c1=c2->System.out.println("hi");
	Consumer<String> c3=c4->System.out.println("hello");
	Consumer<String> c5=c6->System.out.println("lokesh");
	c1.andThen(c3).andThen(c5).accept("hi");;
	
}
}
