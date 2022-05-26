package chapter12Test;

public class IncorrectOptionException extends CalculatorException {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public IncorrectOptionException() {
	setMessage("You did not choose a valid option.");
    }
}
