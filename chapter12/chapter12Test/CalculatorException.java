package chapter12Test;

public abstract class CalculatorException extends Exception {
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

    public CalculatorException() {
	setMessage("You made an error using the calculator.");
    }
}
