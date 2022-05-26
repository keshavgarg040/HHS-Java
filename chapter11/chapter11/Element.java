package chapter11;

public abstract class Element {
    private String atomicSymbol;
    private double atomicWeight;
    private int atomicNumber;

    public Element() {
	setAtomicSymbol("e");
	setAtomicWeight(0);
	setAtomicNumber(0);
    }

    public Element(String aSym, double aWt, int aNum) {
	setAtomicSymbol(aSym);
	setAtomicWeight(aWt);
	setAtomicNumber(aNum);
    }

    public String getAtomicSymbol() {
	return atomicSymbol;
    }

    public void setAtomicSymbol(String atomicSymbol) {
	this.atomicSymbol = atomicSymbol;
    }

    public double getAtomicWeight() {
	return atomicWeight;
    }

    public void setAtomicWeight(double atomicWeight) {
	this.atomicWeight = atomicWeight;
    }

    public int getAtomicNumber() {
	return atomicNumber;
    }

    public void setAtomicNumber(int atomicNumber) {
	this.atomicNumber = atomicNumber;
    }

    public abstract String describeElement();

}
