package chapter10YDIs;

public class DinnerPartyWithConstructor2 extends PartyWithConstructor2 {
    public DinnerPartyWithConstructor2(int numGuests) {
	super(numGuests);
    }

    @Override
    public void displayInvitation() {
	System.out.println("Please come to my dinner party!");
    }

    private int dinnerChoice;

    public int getDinnerChoice() {
	return dinnerChoice;
    }

    public void setDinnerChoice(int dinnerChoice) {
	this.dinnerChoice = dinnerChoice;
    }

}
