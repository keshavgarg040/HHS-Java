package chapter12Test;

public class NegativeNumberException extends CalculatorException {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public NegativeNumberException() {
	setMessage("You cannot enter a negative number.");
    }
}
