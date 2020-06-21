package com.tcs.comparator;

import com.tcs.interf;

public class DefaultMethodTest implements interf {
	
	public static void main(String[] args) {
		
		DefaultMethodTest test=new DefaultMethodTest();
		test.m2();
		
	}

	@Override
	public void m1() {
		
	}
	public void m2() {
		System.out.println("my own implementation");
	}

}
