package school.management.system;

import java.util.List;

// school can have many teachers, many students
// implement teachers and students by using an array list
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    /** new school object is created
     * @param teachers list of teachers
     * @param students list of students in the school
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
    }
}
