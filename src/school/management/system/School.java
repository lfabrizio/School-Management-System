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
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     * @return the list of teachers in the school
     */

    public List<Teacher> getTeachers() {
        return teachers;
    }


    /** add a teacher to the school
     * @param teacher the teacher to be added
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * @return the list of students in the school
     */
    public List<Student> getStudents() {
        return students;
    }

    /** adds a student to the school
     * @param student to be added
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * @return the total mmoney earned by the school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /** adds the total money earned by the school
     * @param MoneyEarned money thats supposed to be added
     */
    public void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     * @return the total money spent by the school
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }


    /** update money that is spent by the school.
     * salary given by school to its teachers
     * @param moneySpent the money spent by school
     */
    public void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
}
