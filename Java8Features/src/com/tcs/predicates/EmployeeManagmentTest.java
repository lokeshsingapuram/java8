package com.tcs.predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.tcs.model.Employee1;

public class EmployeeManagmentTest {
	public static void main(String[] args) {

		
		List<Employee1> employee=new ArrayList<Employee1>();
		populate(employee);
		System.out.println("Display Employees from Bangalore");
		Predicate<Employee1> emp1=empl->empl.getLocation().equalsIgnoreCase("bangalore");
		display(emp1,employee);
		System.out.println("Display Employee Who are Associates");
		Predicate<Employee1> emp2=empl->empl.getDesignation().equalsIgnoreCase("associate");
		display(emp2,employee);
		System.out.println("Display Employees who are having above 27000 salary");
		Predicate<Employee1> emp3=empl->empl.getSalary()>27000;
		display(emp3,employee);
		System.out.println("Display employees who are having salary > 27000 and belongs to bangalore");
		display(emp1.and(emp3), employee);
		System.out.println("Display employees who are not associates");
		display(emp2.negate(),employee );
		System.out.println("Display Emplpoyees who are either either associates are from bangalore");
		display(emp1.or(emp2), employee);
	}

	private static void display(Predicate<Employee1> emp1, List<Employee1> employee) {
		
		employee.forEach(entity->{
			if(emp1.test(entity)) {
				System.out.println(entity);
			}
		});
	}

	private static void populate(List<Employee1> employee) {
		employee.add(new Employee1("lokesh", "Associate", 27000, "bangalore"));
		employee.add(new Employee1("Harish", "Associate", 27000, "bangalore"));
		employee.add(new Employee1("prasanth", "Associate", 27000, "Hyderabad"));
		employee.add(new Employee1("jayanna", "seniorSoftware", 47000, "mysore"));
		employee.add(new Employee1("Chandan", "Software", 27000, "Russia"));
		employee.add(new Employee1("Bhasakar", "CEO", 70000, "USA"));
		employee.add(new Employee1("Kiran", "Chairman", 80000, "USA"));
		employee.add(new Employee1("Sateesh", "SeniorSoftware", 27000, "bangalore"));
		employee.add(new Employee1("Bsateesh", "SeniorSoftware", 27000, "bangalore"));
		employee.add(new Employee1("Parsuram", "Associate", 27000, "bangalore"));
		employee.add(new Employee1("Mithun", "SeniorSoftware", 47000, "bangalore"));

	}
}
