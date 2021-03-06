package com.tcs.predicates;

import java.util.function.Predicate;

public class PredicateTest {
	public static void main(String[] args) {
		Predicate<Integer> p=I->I>10;
		System.out.println(p.test(100));
		System.out.println(p.test(5));
		//predicate joining
		int[] x= {0,20,5,9,89,36,34,60};
		Predicate<Integer> p1=I->I>10;
		Predicate<Integer> p2=I->I%2==0;
		System.out.println("print all the numbers which are greater than 10");
		m1(p1,x);
		System.out.println("print all the even numbers");
		m1(p2,x);
		System.out.println("print all the even numbers and greater than 10");
		m1(p1.and(p2),x);
		System.out.println("print all the numbers which are not greater than 10");
		m1(p1.negate(),x);
		System.out.println("print all the even numbers or greater than 10");
		m1(p1.or(p2),x);
	}

	private static void m1(Predicate<Integer> p, int[] x) {

		for(int x1:x) {
			if(p.test(x1))
			System.out.println(x1);
		}
	}

}
