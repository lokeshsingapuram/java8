package com.tcs.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.tcs.model.Student;

public class ConsumerProgram3 {

	public static void main(String[] args) {
		List<Student> stud = new ArrayList<Student>();
		populate(stud);
		Predicate<Student> p = st -> st.getStudentMarks() > 60;
		Function<Student, String> f = stuMarks -> {

			int marks=stuMarks.getStudentMarks();
			if(marks>80)
				return "Distinction";
			else if(marks>60)
				return "First Class";
			else if(marks>=35)
				return "C Grade";
			else
				return "Fail";

		};
		Consumer<Student> c=c1->{
			System.out.println("Student Id::"+c1.getStudentId());
			System.out.println("Student Name::"+c1.getStudentName());
			System.out.println("Grade::"+f.apply(c1));
		};
		stud.forEach(student->{
	if(p.test(student)) {
		c.accept(student);
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
