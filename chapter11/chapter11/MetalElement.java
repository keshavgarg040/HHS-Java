package chapter11;

public class MetalElement extends Element {

    public MetalElement(String aSym, double aWt, int aNum) {
	super(aSym, aWt, aNum);
    }

    public MetalElement() {
	super();
    }

    @Override
    public String describeElement() {
	String elementDescription = ("Atomic Symbol: " + getAtomicSymbol() + "\nAtomic Weight: " + getAtomicWeight()
		+ "\nAtomic Number: " + getAtomicNumber() + "\nMetals are good conductors of electricity.");
	return elementDescription;

    }

}
