package s1Final;

import java.awt.Toolkit;

public class KookyFace extends Face {

    @Override
    public String makeNoise() {
	for (int i = 0; i < 3; i++) {
	    Toolkit.getDefaultToolkit().beep();
	}
	String noiseString = "I AM KOOKY";
	return noiseString;
    }

}
