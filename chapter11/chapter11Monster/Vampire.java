package chapter11Monster;

public class Vampire extends Monster {
    public Vampire(String nam, String bP, int ag, double tl) {
	super(nam, bP, ag);
	teethLength = tl;
    }

    private double teethLength;

    public double getTeethLength() {
	return teethLength;
    }

    public void setTeethLength(double teethLength) {
	this.teethLength = teethLength;
    }

    public void scaryFactor() {

    }
}
