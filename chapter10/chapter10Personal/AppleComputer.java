package chapter10Personal;

public class AppleComputer extends Computer {

    @Override
    public String description() {
	String description = "CPU: " + getCpu() + "\nMemory (in GB): " + getMemory() + "\nStorage(in TB): "
		+ getStorage() + "\nThis system is best suited for video and photo" + "editing.";
	return description;
    }

}