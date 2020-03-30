package com.fabrizio;

import school.management.system.School;
import school.management.system.Student;
import school.management.system.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	Teacher bray = new Teacher(1, "bray", 500);
	Teacher randy = new Teacher(2, "randy", 700);
	Teacher shayna = new Teacher(3, "shayna", 600);

	List<Teacher> teacherList = new ArrayList<>();
	teacherList.add(bray);
	teacherList.add(randy);
	teacherList.add(shayna);

	Student roman = new Student(1, "roman", 4);
	Student brock = new Student(2, "brock", 12);
	Student becky = new Student(3, "becky", 5);

	List<Student> studentList = new ArrayList<>();
	studentList.add(roman);
	studentList.add(brock);
	studentList.add(becky);

	School shs = new School(teacherList, studentList);

	Teacher kofi = new Teacher(6, "kofi", 900);

	shs.addTeacher(kofi);

    roman.payFees(5000);
    System.out.println("shs has earned $"+ shs.getTotalMoneyEarned());
    roman.payFees(6000);
    System.out.println("shs has earned $" + shs.getTotalMoneyEarned());

		System.out.println(" ----making shs salary----");
		bray.receiveSalary(bray.getSalary());
		System.out.println("shs has spent for salary to " + bray.getName()+ "and now has $" + shs.getTotalMoneyEarned());

		randy.receiveSalary(randy.getSalary());
		System.out.println("shs has spent for salary to "+ randy.getName()+" and now has $" + shs.getTotalMoneyEarned());

		System.out.println(randy);
    }
}
