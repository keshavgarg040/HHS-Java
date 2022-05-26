package chapter12Test;

public class NumberUnderException extends CalculatorException {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public NumberUnderException() {
	setMessage("The number you inputted is under the minimum allowed amount.");
    }
}
