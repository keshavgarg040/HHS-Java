package chapter12Test;

import javax.swing.JOptionPane;

public class AllPurposeCalculator {
    public static String areaOfRectangle() throws NegativeNumberException, NumberUnderException {
	double length = 0;
	double width = 0;
	double area = 0;
	try {
	    length = Double.parseDouble(JOptionPane.showInputDialog("Enter length of rectangle"));
	    width = Double.parseDouble(JOptionPane.showInputDialog("Enter width of rectangle"));
	    if (length < 0 || width < 0) {
		throw new NegativeNumberException();
	    } else if (length == 0 || width == 0) {
		throw new NumberUnderException();
	    }
	    area = length * width;
	} catch (NumberFormatException ex) {
	    JOptionPane.showMessageDialog(null, "Please enter a number");
	    areaOfRectangle();
	} catch (NegativeNumberException nnex) {
	    JOptionPane.showMessageDialog(null, nnex.getMessage());
	    areaOfRectangle();
	} catch (NumberUnderException nuex) {
	    JOptionPane.showMessageDialog(null, nuex.getMessage());
	    areaOfRectangle();
	}
	String answer = "The recrangles area is " + area;
	return answer;
    }

    public static String tipCalc() throws NegativeNumberException, NumberOverException, NumberUnderException {
	double bill = 0;
	double tip = 0;
	double total = 0;
	try {
	    bill = Double.parseDouble(JOptionPane.showInputDialog("Enter bill amount"));
	    tip = Double.parseDouble(JOptionPane.showInputDialog("Enter tip percentage"));
	    if (bill < 0 || tip < 0) {
		throw new NegativeNumberException();
	    } else if (tip >= 100) {
		throw new NumberOverException();
	    } else if (bill == 0) {
		throw new NumberUnderException();
	    }
	    total = bill * (1 + (tip / 100));
	} catch (NumberFormatException ex) {
	    JOptionPane.showMessageDialog(null, "Please enter a number");
	    tipCalc();
	} catch (NegativeNumberException nnex) {
	    JOptionPane.showMessageDialog(null, nnex.getMessage());
	    tipCalc();
	} catch (NumberOverException noex) {
	    JOptionPane.showMessageDialog(null, noex.getMessage());
	    tipCalc();
	} catch (NumberUnderException nuex) {
	    JOptionPane.showMessageDialog(null, nuex.getMessage());
	    tipCalc();
	}
	String tipMessage = "Your total after tip is " + total;
	return tipMessage;
    }

    public static String bodyMassCalc() throws NumberUnderException, NegativeNumberException, NumberOverException {
	double height = 0;
	double weight = 0;
	double index = 0;
	try {
	    height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height in inches"));
	    weight = Double.parseDouble(JOptionPane.showInputDialog("Enter weight in pounds"));
	    double meters = height / 39.36;
	    double kilograms = weight / 2.2;
	    index = kilograms / Math.pow(meters, 2);
	    if (height < 36 || weight < 50) {
		throw new NumberUnderException();
	    } else if (height > 80 || weight > 600) {
		throw new NumberOverException();
	    } else if (height < 0 || weight < 0) {
		throw new NegativeNumberException();
	    }
	} catch (ArithmeticException ex) {
	    JOptionPane.showMessageDialog(null, "You cannot divide by zero");
	    bodyMassCalc();
	} catch (NumberFormatException nfex) {
	    JOptionPane.showMessageDialog(null, "Please enter a number");
	    bodyMassCalc();
	} catch (NumberUnderException nuex) {
	    JOptionPane.showMessageDialog(null, nuex.getMessage());
	    bodyMassCalc();
	} catch (NegativeNumberException nnex) {
	    JOptionPane.showMessageDialog(null, nnex.getMessage());
	    bodyMassCalc();
	}
	String answer = "Your body mass index is " + index;
	return answer;
    }

    public static void ChooseCalculator() throws NegativeNumberException, NumberUnderException, NumberOverException {
	int userInput = Integer.parseInt(JOptionPane.showInputDialog("Choose one of the following:"
		+ "\n1) Area of a Rectangle Calculator" + "\n2) Body Mass Calculator\n3) Tip Calculator"));
	if (userInput == 1) {
	    JOptionPane.showMessageDialog(null, areaOfRectangle());
	} else if (userInput == 2) {
	    JOptionPane.showMessageDialog(null, tipCalc());
	} else if (userInput == 3) {
	    JOptionPane.showMessageDialog(null, bodyMassCalc());
	} else {
	    ChooseCalculator();
	}
    }

    public static void main(String[] args) throws NegativeNumberException, NumberUnderException, NumberOverException {
	ChooseCalculator();
    }
}
