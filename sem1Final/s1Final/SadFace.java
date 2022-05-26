package s1Final;

import java.awt.Color;
import java.awt.Toolkit;

public class SadFace extends Face {

    public SadFace() {
	setFaceColor(Color.red);
	setEyeColor(Color.black);
	setMouthColor(Color.white);
	setFaceSize(200);
	setEyeSize(20);
	setMouthStartArc(0);
	setMouthEndArc(180);
    }

    @Override
    public String makeNoise() {
	Toolkit.getDefaultToolkit().beep();
	String noiseString = "I AM SAD";
	return noiseString;
    }
}
