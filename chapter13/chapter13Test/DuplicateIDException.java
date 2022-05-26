package chapter13Test;

public class DuplicateIDException extends Exception {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String message;

    public String getMessage() {
	return message;
    }

    public void setMessage(String message) {
	this.message = message;
    }

    public DuplicateIDException() {
	setMessage("Please use a unique Ducky ID");
    }
}
