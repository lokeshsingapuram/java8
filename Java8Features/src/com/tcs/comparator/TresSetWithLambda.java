package com.tcs.comparator;

import java.util.Set;
import java.util.TreeSet;

public class TresSetWithLambda {

	public static void main(String[] args) {
		Set<Integer> set=new TreeSet<Integer>(
				(o1,o2)->{
					return (o1>o2) ? -1 :(o1<o2) ? +1 : 0;
				});
{
	set.add(20);
	set.add(0);
	set.add(100);
	set.add(40);
	set.add(70);
	System.out.println(set);
			
			
		}
	}
}
