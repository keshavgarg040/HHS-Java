package chapter03;

public class Student {
    public static void main(String[] args) {
    }

    public static int studentIDNumber;
    public static int creditHoursEarned;
    public static int pointsEarned;

    public static int getStudentIDNumber() {
	return studentIDNumber;
    }

    public static int getCreditHoursEarned() {
	return creditHoursEarned;
    }

    public static int getPointsEarned() {
	return pointsEarned;
    }

    public static void assignStudentIDNumber(int id) {
	studentIDNumber = id;
    }

    public static void assignCreditHoursEarned(int cHE) {
	creditHoursEarned = cHE;
    }

    public static void assignPointsEarned(int pE) {
	pointsEarned = pE;
    }

    public static int calculateGPA(int points, int hours) {
	int calculatedGPA = points / hours;
	return calculatedGPA;
    }
}