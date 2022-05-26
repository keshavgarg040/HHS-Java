package s1Final;

import java.awt.Color;
import java.awt.Toolkit;

public class HappyFace extends Face {

    public HappyFace() {
	setFaceColor(Color.yellow);
	setEyeColor(Color.blue);
	setMouthColor(Color.pink);
	setFaceSize(200);
	setEyeSize(30);
	setMouthStartArc(0);
	setMouthEndArc(-180);
    }

    @Override
    public String makeNoise() {
	for (int i = 0; i < 10; i++) {
	    Toolkit.getDefaultToolkit().beep();
	}
	String noiseString = "I AM HAPPY";
	return noiseString;
    }

}
