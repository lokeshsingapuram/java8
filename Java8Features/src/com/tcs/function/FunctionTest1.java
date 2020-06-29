package com.tcs.function;

import java.util.function.Function;

public class FunctionTest1 {
public static void main(String[] args) {
	String s="This is Lokesh from TCS";
	System.out.println("Replace all spaces in given string");
	Function<String, String> function=s1->s1.replaceAll(" ", "");
	System.out.println(function.apply(s));
	System.out.println("count all spaces in given String");
	Function<String, Integer> f1=s2->s2.length()-s2.replaceAll(" ", "").length();
	System.out.println("count:"+
	f1.apply(s));
}
}
