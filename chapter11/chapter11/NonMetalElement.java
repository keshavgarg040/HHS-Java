package chapter11;

public class NonMetalElement extends Element {

    public NonMetalElement(String aSym, double aWt, int aNum) {
	super(aSym, aWt, aNum);
    }

    public NonMetalElement() {
	super();
    }

    @Override
    public String describeElement() {
	String elementDescription = ("Atomic Symbol: " + getAtomicSymbol() + "\nAtomic Weight: " + getAtomicWeight()
		+ "\nAtomic Number: " + getAtomicNumber() + "\nNonmetals are poor conductors.");
	return elementDescription;
    }

}
