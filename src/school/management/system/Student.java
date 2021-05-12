package school.management.system;
/*
* This class is responsible of keeping the track of students fees, name, grades.
*
*/
public class Student {
    private int ID;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * Creates a student by initializing it. Fees paid is 0, FeesTotal is 30.000
     * @param ID The ID for the student
     * @param name Name of the student
     * @param grade Grade of the student
     */
    public Student(int ID, String name, int grade){
        this.ID = ID;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal  = 30000;
    }

    //Not going to alter student's name, student's ID

    /**
     * Used to update the student's grade
     * @param grade The new grade of the student
     */
    public void SetGrade(int grade){
        this.grade = grade;
    }


    /**
     * Pays the selected amount as fees to school
     * @param fees
     */
    public void PayFees(int fees){
        feesPaid += fees;
        School.UpdateTotalMoneyEarned(feesPaid);
    }

    /**
     *
     * @return The ID of the student
     */
    public int GetID(){
        return ID;
    }

    public String GetName(){
        return name;
    }

    public int GetGrade(){
        return grade;
    }

    public int GetFeesPaid(){
        return feesPaid;
    }

    public int GetFeesTotal(){
        return feesTotal;
    }

    /**
     *
     * @return The remaining fees
     */
     public int GetRemainingFees(){
        return feesTotal - feesPaid;
     }

     @Override
     public String toString(){
         return "Student's name: " + name +
                 "Total fees paid so far: $" + feesPaid;
     }

}
