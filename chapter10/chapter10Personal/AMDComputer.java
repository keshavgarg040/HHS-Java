package chapter10Personal;

public class AMDComputer extends Computer {
    String gpu;

    public String getGpu() {
	return gpu;
    }

    public void setGpu(String gpu) {
	this.gpu = gpu;
    }

    @Override
    public String description() {
	String description = "CPU: " + getCpu() + "\nGPU: " + getGpu() + "\nMemory (in GB): " + getMemory()
		+ "\nStorage(in TB): " + getStorage() + "\nThis system is best suited for code compilation, "
		+ "rendering and other multi-threaded applications.";
	return description;
    }

}