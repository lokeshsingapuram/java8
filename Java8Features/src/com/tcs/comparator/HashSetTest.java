package com.tcs.comparator;

import java.util.HashSet;
import java.util.Set;

import com.tcs.model.Employee;

public class HashSetTest {
	
	public static void main(String[] args) {

		Employee emp=null;
		Set<Employee> set= new HashSet<Employee>();
		emp=new Employee();
		emp.setEmployeeId(101);
		emp.setEmployeeName("lokesh");
        emp.setEmployeeAge(26);
        emp.setEmployeeAddress("KNL");
        set.add(emp);
        Employee emp2=null;
        emp2=new Employee();
   
        emp2.setEmployeeId(102);
        emp2.setEmployeeName("gouri");
        emp2.setEmployeeAge(20);
        emp2.setEmployeeAddress("HYD");
        set.add(emp2);
        System.out.println(set);
	} 
	

}
