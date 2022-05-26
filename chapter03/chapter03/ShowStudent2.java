package chapter03;

public class ShowStudent2 {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
	Student newStudent = new Student();
	Student.assignStudentIDNumber(9999);
	Student.assignCreditHoursEarned(3);
	Student.assignPointsEarned(12);
	System.out.println("Student " + newStudent.getStudentIDNumber() + "'s GPA is "
		+ newStudent.calculateGPA(newStudent.getPointsEarned(), newStudent.getCreditHoursEarned()));
	System.out.println("Student ID Number: " + newStudent.getStudentIDNumber());
	System.out.println("Credit Hours Earned: " + newStudent.getCreditHoursEarned());
	System.out.println("Points Earned: " + newStudent.getPointsEarned());
    }
}
