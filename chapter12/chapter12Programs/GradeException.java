package chapter12Programs;

public class GradeException extends Exception {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    public static final char[] VALID_GRADES = { 'A', 'B', 'C', 'D', 'F', 'I' };

    public GradeException(String string) {
	super(string);
    }
}