package chapter03;

public class Card {
    public static String spades;
    public static String hearts;
    public static String diamonds;
    public static String clubs;

    public static void main(String[] args) {
    }

    public static void assignSpades() {
	spades = "Spades";
    }

    public static void assignHearts() {
	hearts = "Hearts";
    }

    public static void assignDiamonds() {
	diamonds = "Diamonds";
    }

    public static void assignClubs() {
	clubs = "Clubs";
    }

    public static String getSpades() {
	return spades;
    }

    public static String getHearts() {
	return hearts;
    }

    public static String getDiamonds() {
	return diamonds;
    }

    public static String getClubs() {
	return clubs;
    }
}
