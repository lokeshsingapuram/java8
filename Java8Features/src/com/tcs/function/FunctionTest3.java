//program to find total salary of all employees
package com.tcs.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.tcs.model.Employee1;

public class FunctionTest3 {
	public static void main(String[] args) {
		List<Employee1> employee = new ArrayList<Employee1>();
		populate(employee);
		

		Function<List<Employee1>, Double> f = employeeList -> {
			double total = 0.0;
			for (Employee1 e1 : employeeList) {
				total = total + e1.getSalary();
			}
			return total;
		};
System.out.println("total salary of all employees::"+f.apply(employee));
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
