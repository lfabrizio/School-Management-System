package school.management.system;
// this class is responsible for keeping track of teachers name, ID, and salary
public class Teacher {

    private int id;
    private String name;
    private int salary;


    /**
     * creates a new teacher object
     *
     * @param id     teacher id : unique
     * @param name   teacher name
     * @param salary salary of the teacher
     */

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     *
     * @return id for the current teacher
     */
    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public int getSalary(){
        return salary;
    }


}
