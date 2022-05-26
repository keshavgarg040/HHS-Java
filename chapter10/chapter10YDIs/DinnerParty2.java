package chapter10YDIs;

public class DinnerParty2 extends Party {
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
