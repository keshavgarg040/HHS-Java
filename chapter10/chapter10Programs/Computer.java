package chapter10Programs;

public class Computer {
    int storage;
    int ram;
    String operatingSystem;
    Boolean videoCard;
    String cpu = "Manufacturer CPU";

    public int getStorage() {
	return storage;
    }

    public void setStorage(int storage) {
	this.storage = storage;
    }

    public int getRAM() {
	return ram;
    }

    public void setRAM(int rAM) {
	ram = rAM;
    }

    public String getOperatingSystem() {
	return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
	this.operatingSystem = operatingSystem;
    }

    public Boolean getVideoCard() {
	return videoCard;
    }

    public void setVideoCard(Boolean videoCard) {
	this.videoCard = videoCard;
    }

    public String getCPU() {
	return cpu;
    }

    public void setCPU(String CPU) {

    }

    @Override
    public String toString() {
	return "Computer [storage=" + storage + ", ram=" + ram + ", operatingSystem=" + operatingSystem + ", videoCard="
		+ videoCard + ", cpu=" + cpu + "]";
    }
}
