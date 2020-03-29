package com.fabrizio;

import school.management.system.School;
import school.management.system.Student;
import school.management.system.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	Teacher bray = new Teacher(1, "bray", 500);
	Teacher drew = new Teacher(2, "drew", 700);
	Teacher shayna = new Teacher(3, "shayna", 600);

	List<Teacher> teacherList = new ArrayList<>();
	teacherList.add(bray);
	teacherList.add(drew);
	teacherList.add(shayna);

	Student roman = new Student(1, "roman", 4);
	Student brock = new Student(2, "brock", 12);
	Student becky = new Student(3, "becky", 5);

	List<Student> studentList = new ArrayList<>();
	studentList.add(roman);
	studentList.add(brock);
	studentList.add(becky);

	School shs = new School(teacherList, studentList);
        System.out.println("SHS has earned " + shs.getTotalMoneyEarned());
    }
}
