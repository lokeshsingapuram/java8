package com.tcs.comparator;

import com.tcs.interf;

public class AnonymousWithoutLambda {
	int x = 999;

	public void m2() {
		interf test = new interf() {
			int x = 888;

			@Override
			public void m1() {
				System.out.println(this.x);
			}
		};
		test.m1();

	}

	public static void main(String[] args) {
		AnonymousWithoutLambda lambda = new AnonymousWithoutLambda();
		lambda.m2();
	}

}
