package school.management.system;

import java.util.List;

/**
 * Many teachers, many students
 * Implements teachers and students using an ArrayList
 */

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * Creates a School object
     * @param teachers List of teachers in the school
     * @param students List of students in the school
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     * Shows a list of teachers
     * @return The list of teachers in the school
     */
    public List<Teacher> GetTeachers() {
        return teachers;
    }

    /**
     * Adds a teacher to the school
     * @param teacher The teacher to be added
     */
    public void AddTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * Shows a list of students
     * @return The list of students in the school
     */
    public List<Student> GetStudents() {
        return students;
    }

    /**
     * Adds a student to the school
     * @param student The student to be added
     */
    public void AddStudent(Student student) {
        students.add(student);
    }

    /**
     *
     * @return The total money earned by the school
     */
    public int GetTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money by the school
     * @param moneyEarned Money that's supposed to be added
     */
    public static void UpdateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    /**
     *
     * @return The total money spent by the school
     */
    public int GetTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * Update the money that is spent by the school
     * which is the salary given by the school to the teachers
     * @param moneySpent The money that the school spent
     */
    public static void UpdateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
}
