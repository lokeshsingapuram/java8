package com.tcs.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSorting {
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(0);
		list.add(5);
		list.add(54);
		list.add(67);
		System.out.println("Before sorting::"+list);
		Collections.sort(list,new mycomparator());
		System.out.println("After Sorting::"+list);
	}
	


}
