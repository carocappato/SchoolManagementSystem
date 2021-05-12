package school.management.system;

/**
 * This class is responsible for keeping the track of teachers name, id
 */
public class Teacher {
    private int ID;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Creates a new Teacher object
     * @param ID The ID of the teacher
     * @param name The name of the teacher
     * @param salary The salary of the teacher
     */
    public Teacher(int ID, String name, int salary){
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }


    public int GetID(){
        return ID;
    }

    public String GetName(){
        return name;
    }


    public int GetSalary(){
        return salary;
    }

    public void SetSalary(int salary){
        this.salary = salary;
    }

    /**
     * Adds  to salaryEarned.
     * Removes from the total money earned by the school.
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.UpdateTotalMoneySpent(salary);
    }


    @Override
    public String toString() {
        return "Name of the Teacher: " + name
                +" Total salary earned so far: $"
                + salaryEarned;
    }
}
