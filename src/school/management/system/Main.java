package school.management.system;

/*
* Money management system for school
* Keep track of students total fees
* Fees already paid
* Teachers salaries
*
* School:
* Teachers, Students, Total money earned, total money spent - teachers salaries
*
* Teacher:
* - ID
* - Name
* - Salary
*
* Student
* - ID
* - Name
* - Grade
* - Fees paid
* - Fees total
*
*
* */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher mellisa = new Teacher(2, "Mellisa", 700);
        Teacher vanderhorn = new Teacher(3, "Vanderhorn", 600);
        Teacher megan = new Teacher(6,"Megan", 900);

        List<Teacher> teachersList = new ArrayList<>();
        teachersList.add(lizzy);
        teachersList.add(mellisa);
        teachersList.add(vanderhorn);


        Student tamasha = new Student(1, "Tamasha",4);
        Student rakshith = new Student(2, "Rakshith",12);
        Student rabbi = new Student(3, "Rabbi",5);

        List<Student> studentsList = new ArrayList<>();
        studentsList.add(tamasha);
        studentsList.add(rakshith);
        studentsList.add(rabbi);

        School ghs = new School(teachersList, studentsList);

        ghs.AddTeacher(megan);

        tamasha.PayFees(5000);
        rakshith.PayFees(6000);
        System.out.println("GHS has earned $"+ ghs.GetTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        lizzy.receiveSalary(lizzy.GetSalary());
        System.out.println("GHS has spent for salary to " + lizzy.GetName()
        +" and now has $" + ghs.GetTotalMoneyEarned());

        vanderhorn.receiveSalary(vanderhorn.GetSalary());
        System.out.println("GHS has spent for salary to " + vanderhorn.GetName()
                +" and now has $" + ghs.GetTotalMoneyEarned());


        System.out.println(rakshith);

        mellisa.receiveSalary(mellisa.GetSalary());

        System.out.println(mellisa);

    }
}
