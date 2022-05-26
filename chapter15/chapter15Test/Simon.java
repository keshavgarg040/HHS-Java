package chapter15Test;

import javax.swing.*;

import java.awt.*;
import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;

public class Simon extends JFrame implements ActionListener, Runnable {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    static Simon f1;
    static Thread t1;
    int counter;
    int correctButtons;
    int wTime = 2000;
    int rButton;
    Color lBlue = (new Color(173, 224, 255));
    Color lRed = (new Color(255, 183, 183));
    Color lGreen = (new Color(173, 255, 173));
    Color lYellow = (new Color(255, 255, 217));
    JButton[] buttons = new JButton[4];
    JPanel buttonPanel = new JPanel(new GridLayout(2, 2));
    ArrayList<Integer> patternList;

    public Simon() {
	this.setTitle("Simon");
	buttons[0] = new JButton();
	buttons[1] = new JButton();
	buttons[2] = new JButton();
	buttons[3] = new JButton();
	buttons[0].setBackground(lBlue);
	buttons[1].setBackground(lRed);
	buttons[2].setBackground(lGreen);
	buttons[3].setBackground(lYellow);
	buttonPanel.add(buttons[0]);
	buttonPanel.add(buttons[1]);
	buttonPanel.add(buttons[2]);
	buttonPanel.add(buttons[3]);
	add(buttonPanel);
    }

    @Override
    public void run() {
	rButton = (int) (Math.random() * 3);
	if (rButton == 0) {
	    buttons[rButton].setBackground(Color.BLUE);
	    pause(wTime);
	    buttons[rButton].setBackground(lBlue);
	} else if (rButton == 1) {
	    buttons[rButton].setBackground(Color.RED);
	    pause(wTime);
	    buttons[rButton].setBackground(lRed);
	} else if (rButton == 2) {
	    buttons[rButton].setBackground(Color.GREEN);
	    pause(wTime);
	    buttons[rButton].setBackground(lGreen);
	} else {
	    buttons[rButton].setBackground(Color.YELLOW);
	    pause(wTime);
	    buttons[rButton].setBackground(lYellow);
	}

    }

    public void actionPerformed(ActionEvent e) {
	synchronized (this) {
	    if (e.getSource() == buttons[rButton]) {
		++correctButtons;
		System.out.println(correctButtons);
	    } else {
		System.out.println("User clicked incorrect button");
		if (JOptionPane.showConfirmDialog(null, "Would you like to play again?", "Play Again?",
			JOptionPane.YES_NO_OPTION) == 0) {
		    System.exit(0);
		} else {
		    counter = 0;
		    t1 = new Thread(f1);
		    t1.start();
		}
	    }
	    Toolkit.getDefaultToolkit().beep();
	    if (correctButtons == patternList.size()) {
		counter = 0;
		t1 = new Thread(f1);
		t1.start();
	    }
	}
    }

    private synchronized void pause(int pauseTime) {
	try {
	    Thread.sleep(pauseTime);
	} catch (InterruptedException ex) {
	    System.out.print(ex);
	}
    }

    public static void main(String[] args) {
	f1 = new Simon();
	f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	f1.setSize(512, 512);
	f1.setVisible(true);
	t1 = new Thread(f1);
	t1.start();
    }
}
