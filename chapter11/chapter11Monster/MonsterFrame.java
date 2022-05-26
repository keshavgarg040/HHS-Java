package chapter11Monster;

import java.awt.event.*;
import javax.swing.JFrame;

public class MonsterFrame extends JFrame {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private Activator caller;
    String image;

    public MonsterFrame(boolean vPict, Activator callerObj) {
	caller = callerObj;

	addWindowListener(new WindowAdapter() {
	    public void windowClosing(WindowEvent ex) {
		dispose();
		caller.activate();
	    }
	});

	if (vPict)
	    image = "vampire.jpg";
	else
	    image = "ghost.jpg";
	PaintPanel pictPanel = new PaintPanel(image);
	add(pictPanel);
    }
}
