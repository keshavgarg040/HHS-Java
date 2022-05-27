package chapter16Programs;

import javax.swing.JPanel;

public class OSPanel extends JPanel {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public enum OS {
	LINUX, MAC, WINDOWS
    };

    public static OS getOS() {
	String os = System.getProperty("os.name").toLowerCase();
	if (os.contains("nix")) {
	    return OS.LINUX;
	} else if (os.contains("mac")) {
	    return OS.MAC;
	} else if (os.contains("win")) {
	    return OS.WINDOWS;
	}
	return null;
    }

    public static void main(String[] args) {
	switch (getOS()) {
	case LINUX:
	    System.out.println("Linux");
	case MAC:
	    System.out.println("Mac");
	case WINDOWS:
	    System.out.println("Windows");
	}
    }
}
