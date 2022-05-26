package chapter10Personal;

public class IntelComputer extends Computer {
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
		+ "\nStorage(in TB): " + getStorage() + "\nThis system is best suited for gaming and other "
		+ "lightly threaded workloads, such as file decompression.";
	return description;
    }

}