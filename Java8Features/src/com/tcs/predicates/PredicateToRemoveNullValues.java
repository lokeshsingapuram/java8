/*
 * 
 * Program to remove null values and empty string in given array
 * */

package com.tcs.predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateToRemoveNullValues {
	private static List<String> removeNullEmptyvalues(Predicate<String> removevalues, String[] names) {
		List<String> l=new ArrayList<String>();
		for(String name:names) {
			if(removevalues.test(name)) {
				l.add(name);
			}
		}
		return l;

	}

	public static void main(String[] args) {
		String[] names = { "lokesh", "rajesh", "", null, "gouri" };
		Predicate<String> removevalues = name -> name != null && name.length() != 0;
		List<String> listOfFinalNames = removeNullEmptyvalues(removevalues, names);
		System.out.println(listOfFinalNames);
	}

}
