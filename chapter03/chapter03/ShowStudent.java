package chapter03;

public class ShowStudent {
    public static void main(String[] args) {
	Student.assignStudentIDNumber(5);
	Student.assignCreditHoursEarned(3);
	Student.assignPointsEarned(12);
	System.out.println("Student " + Student.getStudentIDNumber() + "'s GPA is "
		+ Student.calculateGPA(Student.getPointsEarned(), Student.getCreditHoursEarned()));
	System.out.println("Student ID Number: " + Student.getStudentIDNumber());
	System.out.println("Credit Hours Earned: " + Student.getCreditHoursEarned());
	System.out.println("Points Earned: " + Student.getPointsEarned());
    }
}
