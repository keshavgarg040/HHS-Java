package chapter11;

import javax.swing.JOptionPane;

public class ElementArray {
    public static void main(String[] args) {
	Element[] elementArray = new Element[4];
	elementArray[0] = new MetalElement();
	elementArray[1] = new MetalElement();
	elementArray[2] = new NonMetalElement();
	elementArray[3] = new NonMetalElement();

	for (int i = 0; i < elementArray.length; i++) {
	    elementArray[i].setAtomicSymbol(JOptionPane.showInputDialog("Enter elements atomic symbol: "));
	    elementArray[i]
		    .setAtomicWeight(Double.parseDouble(JOptionPane.showInputDialog("Enter elements atomic weight: ")));
	    elementArray[i]
		    .setAtomicNumber(Integer.parseInt(JOptionPane.showInputDialog("Enter elements atomic number: ")));
	}
	for (int i = 0; i < elementArray.length; i++) {
	    JOptionPane.showMessageDialog(null, elementArray[i].describeElement());
	}
    }

}
