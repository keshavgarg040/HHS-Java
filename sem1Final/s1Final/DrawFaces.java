package s1Final;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class DrawFaces extends JFrame implements ActionListener {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    static DrawFaces f1;
    JFrame facesFrame = new JFrame();
    JButton happyButton = new JButton("Happy");
    JButton sadButton = new JButton("Sad");
    JButton kookyButton = new JButton("Kooky");
    JLabel faceLabel = new JLabel();
    JPanel faceButtonPanel = new JPanel();
    int kookyFaceSize;
    int kookyEyeSize;
    int kookyStartArc;
    int kookyEndArc;
    boolean isValidFace;

    public DrawFaces() {
	happyButton.addActionListener(this);
	sadButton.addActionListener(this);
	kookyButton.addActionListener(this);
	faceButtonPanel.add(happyButton);
	faceButtonPanel.add(sadButton);
	faceButtonPanel.add(kookyButton);
	faceButtonPanel.setLayout(new GridLayout(1, 3));
	this.add(faceButtonPanel, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
	Face newFace;
	Graphics faceGraphics = getGraphics();
	if (e.getSource() == happyButton) {
	    newFace = new HappyFace();
	    newFace.makeNoise();
	    faceGraphics.setColor(newFace.getFaceColor());
	    faceGraphics.fillOval(100, 150, newFace.getFaceSize(), newFace.getFaceSize());
	    faceGraphics.setColor(newFace.getEyeColor());
	    faceGraphics.fillOval(170, 200, newFace.getEyeSize(), newFace.getEyeSize());
	    faceGraphics.fillOval(210, 200, newFace.getEyeSize(), newFace.getEyeSize());
	    faceGraphics.fillArc(150, 250, 100, 50, newFace.getMouthStartArc(), newFace.getMouthEndArc());
	    faceGraphics.setColor(newFace.getMouthColor());
	} else if (e.getSource() == sadButton) {
	    newFace = new SadFace();
	    newFace.makeNoise();
	    faceGraphics.setColor(newFace.getFaceColor());
	    faceGraphics.fillOval(100, 150, newFace.getFaceSize(), newFace.getFaceSize());
	    faceGraphics.setColor(newFace.getEyeColor());
	    faceGraphics.fillOval(170, 200, newFace.getEyeSize(), newFace.getEyeSize());
	    faceGraphics.fillOval(210, 200, newFace.getEyeSize(), newFace.getEyeSize());
	    faceGraphics.setColor(newFace.getMouthColor());
	    faceGraphics.fillArc(150, 250, 100, 50, newFace.getMouthStartArc(), newFace.getMouthEndArc());
	} else if (e.getSource() == kookyButton) {
	    newFace = new KookyFace();
	    newFace.makeNoise();
	    isValidFace = false;
	    while (!isValidFace) {
		try {
		    kookyFaceSize = Integer.parseInt(JOptionPane.showInputDialog("Enter face size"));
		    if (kookyFaceSize < 200 || kookyFaceSize > 500) {
			throw new InvalidFaceSizeException();
		    }
		    kookyEyeSize = Integer.parseInt(JOptionPane.showInputDialog("Enter eye size"));
		    if (kookyEyeSize < 20 || kookyEyeSize > 100) {
			throw new InvalidEyeSizeException();
		    }
		    isValidFace = true;
		} catch (InvalidFaceSizeException ex) {
		    JOptionPane.showMessageDialog(null, ex.getMessage());
		    isValidFace = false;
		} catch (InvalidEyeSizeException ieex) {
		    JOptionPane.showMessageDialog(null, ieex.getMessage());
		    isValidFace = false;
		} catch (NumberFormatException nfex) {
		    JOptionPane.showMessageDialog(null, "Entry must be a number");
		    isValidFace = false;
		}
	    }

	    kookyStartArc = Integer.parseInt(JOptionPane.showInputDialog("Enter start arc"));
	    kookyEndArc = Integer.parseInt(JOptionPane.showInputDialog("Enter end arc"));
	    Color kookyFaceColor = new Color(getRandomRGBVal(), getRandomRGBVal(), getRandomRGBVal());
	    faceGraphics.setColor(kookyFaceColor);
	    faceGraphics.fillOval(100, 150, kookyFaceSize, kookyFaceSize);
	    Color kookyEyeColor = new Color(getRandomRGBVal(), getRandomRGBVal(), getRandomRGBVal());
	    faceGraphics.setColor(kookyEyeColor);
	    faceGraphics.fillOval(170, 200, kookyEyeSize, kookyEyeSize);
	    faceGraphics.fillOval(210, 200, kookyEyeSize, kookyEyeSize);
	    Color kookyMouthColor = new Color(getRandomRGBVal(), getRandomRGBVal(), getRandomRGBVal());
	    faceGraphics.setColor(kookyMouthColor);
	    faceGraphics.fillArc(150, 250, 100, 50, kookyStartArc, kookyEndArc);
	}
    }

    public static void main(String[] args) {
	f1 = new DrawFaces();
	f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	f1.setTitle("Faces");
	f1.setBounds(0, 0, 600, 750);
	f1.setVisible(true);
    }

    public int getRandomRGBVal() {
	int value = (int) (Math.random() * 256);
	return value;
    }

}
