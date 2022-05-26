package s1Final;

public class InvalidFaceSizeException extends InvalidInputException {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public InvalidFaceSizeException() {
	setMessage();
    }

    @Override
    public void setMessage() {
	message = "Face size needs to be between 200 and 500.";
    }

}
