package com.tcs.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import com.tcs.model.Student;

public class FunctionTest2 {

	public static void main(String[] args) {
Predicate<Student> p=p1->p1.getStudentMarks()>60;
		Function<Student, String>f=student->{
			int marks=student.getStudentMarks();
			if(marks>80)
				return "A Grade";
			else if(marks>60)
				return "B Grade";
			else if(marks>=35)
				return "C Grade";
			else
				return "Fail";
		};
		
		List<Student> list=new ArrayList<Student>();
		populate(list);
		display(p,f,list);
	}

	private static void display(Predicate<Student> p, Function<Student, String> f, List<Student> list) {
		list.forEach(entity->{
			if(p.test(entity)) {
				System.out.println("Student Name::"+entity.getStudentName());
				System.out.println("Student Marks::"+entity.getStudentMarks());
				System.out.println("Student Grade::"+f.apply(entity));
				System.out.println();
			}
		});
	}

	private static void populate(List<Student> list) {
		list.add(new Student(101, "nick", 100));
		list.add(new Student(102, "jones", 60));
		list.add(new Student(104, "smith", 55));
		list.add(new Student(104, "clarke", 78));
	}

}
