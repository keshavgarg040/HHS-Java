package s1Final;

public class InvalidEyeSizeException extends InvalidInputException {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public InvalidEyeSizeException() {
	setMessage();
    }

    @Override
    public void setMessage() {
	message = "Eye size needs to be between 20 and 100";
    }

}
