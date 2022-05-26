package s1Final;

public abstract class InvalidInputException extends Exception {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    protected String message;

    public InvalidInputException() {
	message = "You did not enter a valid input.";
    }

    public String getMessage() {
	return message;
    }

    public abstract void setMessage();
}
