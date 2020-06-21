package com.tcs.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.tcs.model.Employee;

public class SortingEmployeeObject {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1734970, "lokesh", 26, "KNL"));
		list.add(new Employee(1736798, "Gouri", 20, "KNL"));
		list.add(new Employee(1734989, "harish", 24, "KNL"));
		list.add(new Employee(1890006, "prasanth", 25, "KNL"));
		list.add(new Employee(1678899, "sateesh", 22, "KNL"));
		list.add(new Employee(1736789, "chandan", 23, "KNL"));
		list.add(new Employee(173566, "jones", 36, "KNL"));
		System.out.println("before sorting::");
		list.forEach(entity->{
			System.out.println(entity);
		});
		Collections.sort(list,(employee1,employee2)->{
			return (employee1.getEmployeeAge()>employee2.getEmployeeAge())?-1:(employee1.getEmployeeAge()<employee2.getEmployeeAge())?+1:0;
		});
System.out.println("After sorting::");
		list.forEach(entity->{
			System.out.println(entity);
		});
	}

}
