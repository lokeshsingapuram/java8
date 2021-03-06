package com.tcs.predicates;

import java.util.function.Predicate;

public class PredicateTestNameStartsWithK {

	private static void getNamesStartsWithK(Predicate<String> namesStartsWithK, String[] names) {

		for (String name : names) {
			if (namesStartsWithK.test(name)) {
				System.out.println(name);
			}
		}
	}

	public static void main(String[] args) {
		String[] names = { "gouri", "karthik", "kavya", "kalpana", "kashmir", "kangana" };
		Predicate<String> namesStartsWithK = name -> name.charAt(0) == 'k';
		getNamesStartsWithK(namesStartsWithK, names);
	}

}
