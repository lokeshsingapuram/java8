//program to give additional increment who are having 27000 salary
package com.tcs.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import com.tcs.model.Employee1;

public class FunctionTest4 {

	public static void main(String[] args) {
		List<Employee1> list = new ArrayList<Employee1>();
		populate(list);
		Predicate<Employee1> emp = emp1 -> emp1.getSalary() < 28000;
		Function<Employee1, Employee1> f = eachEmployee -> {
			double salary=0.0;
			salary=eachEmployee.getSalary() + 5000;
			eachEmployee.setSalary(salary);
			return eachEmployee;
		};
		List<Employee1> employeeDetails = display(emp, f, list);
		employeeDetails.forEach(entity->{
			System.out.println(entity);
		});

	}

	private static List<Employee1> display(Predicate<Employee1> emp, Function<Employee1, Employee1> f, List<Employee1> list) {

		List<Employee1> listOfEmployyesgetsBenfitted = new ArrayList<Employee1>();
		/*
		 * list.forEach(employee -> { if (emp.test(employee)) {
		 * listOfEmployyesgetsBenfitted.add(f.apply(employee)); } });
		 */
		for(Employee1 e:list) {
			if(emp.test(e)) {
				listOfEmployyesgetsBenfitted.add(f.apply(e));
			}
		}
		return listOfEmployyesgetsBenfitted;
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
