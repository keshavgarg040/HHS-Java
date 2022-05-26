package chpater14Test;

public class Student {
    String first;
    String last;
    double grade;

    public Student(String fn, String ln, double gr) {
	setFirst(fn);
	setLast(ln);
	setGrade(gr);
    }

    public String getFirst() {
	return first;
    }

    public void setFirst(String first) {
	this.first = first;
    }

    public String getLast() {
	return last;
    }

    public void setLast(String last) {
	this.last = last;
    }

    public double getGrade() {
	return grade;
    }

    public void setGrade(double grade) {
	this.grade = grade;
    }
}
