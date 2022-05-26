package chapter14YDIs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JResortCalculator extends JFrame implements ItemListener {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    final int BASE_PRICE = 200;
    final int WEEKEND_PREMIUM = 100;
    final int BREAKFAST_PREMIUM = 20;
    final int GOLF_PREMIUM = 75;
    int totalPrice = BASE_PRICE;

    JCheckBox weekendBox = new JCheckBox("Weekend premium $" + WEEKEND_PREMIUM, false);
    JCheckBox breakfastBox = new JCheckBox("Breakfast $" + BREAKFAST_PREMIUM, false);
    JCheckBox golfBox = new JCheckBox("Golf $" + GOLF_PREMIUM, false);
    JLabel resortLabel = new JLabel("Resort Price Calculator");
    JLabel priceLabel = new JLabel("The price for your stay is");
    JTextField totPrice = new JTextField(4);
    JLabel optionExplainLabel = new JLabel("Base price for a room is $" + BASE_PRICE + ".");
    JLabel optionExplainLabel2 = new JLabel("Check the options you want.");

    public JResortCalculator() {
	super("Resort Price Estimator");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(new FlowLayout());
	add(resortLabel);
	add(optionExplainLabel);
	add(optionExplainLabel2);
	add(weekendBox);
	add(breakfastBox);
	add(golfBox);
	add(priceLabel);
	add(totPrice);
	totPrice.setText("$" + totalPrice);
	weekendBox.addItemListener(this);
	breakfastBox.addItemListener(this);
	golfBox.addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent event) {

    }
}
