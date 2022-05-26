package chapter12Test;

public class NumberOverException extends CalculatorException {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public NumberOverException() {
	setMessage("The number you inputted is over the maximum allowed amount.");
    }
}
