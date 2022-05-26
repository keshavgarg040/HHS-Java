package chapter11YDIs;

import javax.swing.JOptionPane;

public class VehicleDatabase {
    public static void main(String[] args) {
	Vehicle[] vehicles = new Vehicle[5];

	for (int i = 0; i < vehicles.length; ++i) {
	    String userEntry;
	    int vehicleType;
	    userEntry = JOptionPane.showInputDialog(null,
		    "Please select the type of\n" + "vehicle you want to enter: \n1 - " + "Sailboat\n 2 - Bicycle");
	    vehicleType = Integer.parseInt(userEntry);
	    if (vehicleType == 1)
		vehicles[i] = new Sailboat();
	    else
		vehicles[i] = new Bicycle();
	}
	StringBuffer outString = new StringBuffer();
	for (int i = 0; i < vehicles.length; ++i) {
	    outString.append("\n#" + (i + 1) + " ");
	    outString.append(vehicles[i].toString());
	}
	JOptionPane.showMessageDialog(null, "Our available Vehicles include:\n" + outString);
    }
}
