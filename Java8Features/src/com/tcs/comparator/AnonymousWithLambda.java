package com.tcs.comparator;

import com.tcs.interf;

public class AnonymousWithLambda {

	int x = 999;

	public void m2() {
		interf test = ()-> {
			int x = 888;
			System.out.println(x);
				System.out.println(this.x);
		};
		test.m1();
	}

	public static void main(String[] args) {
		AnonymousWithLambda lambda = new AnonymousWithLambda();
		lambda.m2();
	}
}
