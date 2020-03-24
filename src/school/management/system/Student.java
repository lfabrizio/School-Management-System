package school.management.system;
// this class is responsible to keep track of the students fees, name, grade, and fees
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     *
     * @param id student id : unique
     * @param name student name
     * @param grade students grade
     */
    public Student(int id, String name, int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
}
