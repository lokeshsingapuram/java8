package com.tcs.predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.tcs.model.SoftwareEngineer;

public class PredicateSoftwareEngineerTest {
	public static void main(String[] args) {
		List<SoftwareEngineer> list=new ArrayList<SoftwareEngineer>();
		list.add(new SoftwareEngineer("lokesh", 26, true));
		list.add(new SoftwareEngineer("harish", 24, true));
		list.add(new SoftwareEngineer("jai", 26, true));
		list.add(new SoftwareEngineer("parsuram",24,false));
		list.add(new SoftwareEngineer("sateesh", 24, true));
		list.add(new SoftwareEngineer("kiran", 24, true));
		Predicate<SoftwareEngineer> allowed=engineer->engineer.getAge()>18 && engineer.isHavingGF();
		list.forEach(allowedEngineer->{
			if(allowed.test(allowedEngineer)) {
				System.out.println(allowedEngineer);
			}
		});
	}

}
