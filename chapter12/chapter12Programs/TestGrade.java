package chapter12Programs;

import javax.swing.*;

public class TestGrade {
    public static void main(String args[]) throws Exception {
	int[] id = { 1234, 1245, 1267, 1278, 2345, 1256, 3456, 3478, 4567, 5678 };
	char[] grade = new char[10];
	String gradeString = new String();
	String inString, outString = "";
	int flag = 0;
	for (int i = 0; i < id.length; ++i) {
	    inString = JOptionPane.showInputDialog(null, "Enter letter grade for student id number: " + id[i]);
	    grade[i] = inString.charAt(0);
	    try {
		flag = 0;
		for (int y = 0; y < GradeException.VALID_GRADES.length; ++y) {
		    if (grade[i] == GradeException.VALID_GRADES[y])
			flag = 1;
		}
		if (flag == 0) {
		    gradeString = "Invalid grade";
		    throw (new GradeException(gradeString));
		}
	    } catch (GradeException e) {
		JOptionPane.showMessageDialog(null, e.getMessage());
		grade[i] = 'I';
	    }
	}
	for (int i = 0; i < id.length; ++i)
	    outString = outString + "ID #" + id[i] + "  Grade " + grade[i] + "\n";
	JOptionPane.showMessageDialog(null, outString);
    }
}