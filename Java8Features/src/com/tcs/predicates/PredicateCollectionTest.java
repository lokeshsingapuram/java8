package com.tcs.predicates;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;

public class PredicateCollectionTest {

	public static void main(String[] args) {

		
		Predicate<Collection> p=collection->collection.isEmpty();
		List< Integer> l=new ArrayList<Integer>();
		l.add(20);
		System.out.println(p.test(l));
		Set<Integer> set=new TreeSet<Integer>();
		System.out.println(p.test(set));
	}

}
