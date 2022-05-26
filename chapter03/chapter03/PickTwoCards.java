package chapter03;

public class PickTwoCards {
    public static void main(String[] args) {
	int myValue;
	Card.assignDiamonds();
	Card.getDiamonds();
	Card.assignSpades();
	Card.getSpades();
	Card.assignClubs();
	Card.getClubs();
	Card.assignHearts();
	Card.getHearts();
	final int CARDS_IN_SUIT = 13;
	myValue = ((int) (Math.random() * 100) % CARDS_IN_SUIT + 1);
	int randCard = ((int) (Math.random() * 4) + 1);

	if (randCard == 1) {
	    System.out.println(myValue + " of " + Card.getDiamonds());
	} else if (randCard == 2) {
	    System.out.println(myValue + " of " + Card.getSpades());
	} else if (randCard == 3) {
	    System.out.println(myValue + " of " + Card.getHearts());
	} else if (randCard == 4) {
	    System.out.println(myValue + " of " + Card.getClubs());
	}
    }
}
