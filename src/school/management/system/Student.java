package school.management.system;
// this class is responsible to keep track of the students fees, name, grade, and fees
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * @param id    student id : unique
     * @param name  student name
     * @param grade students grade
     */
    public Student(int id, String name, int grade) {
        this.feesPaid = 0;
        this.feesTotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    // not going to alter students name or ID
    /** used to update the students grade
     * @param grade new grade of the student
     */
    public void  setGrade(int grade) {
        this.grade = grade;
    }

    /** add the fee to the fees paid
     * @param fees the fees that the student pays
     */
    public void payFees(int fees){
    feesPaid += fees;
    School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     *
     * @return id of the student.
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return the grade of the student.
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return fees paid by the student.
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return the total fees of the student.
     */
    public int getFeesTotal() {
        return feesTotal;
    }


    /**
     *
     * @return the remaining fees
     */
        public int getRemainingFees(){
        return feesTotal-feesPaid;
        }

        @Override
        public String toString() {
            return "Student's name :"+name+ "Total fees paid so far $"+ feesPaid;
        }
}
