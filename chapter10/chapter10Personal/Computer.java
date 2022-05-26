package chapter10Personal;

public abstract class Computer {
    String cpu;
    int memory;
    int storage;

    public int getMemory() {
	return memory;
    }

    public void setMemory(int memory) {
	this.memory = memory;
    }

    public int getStorage() {
	return storage;
    }

    public void setStorage(int storage) {
	this.storage = storage;
    }

    public String getCpu() {
	return cpu;
    }

    public void setCpu(String CPU) {
	this.cpu = CPU;
    }

    public abstract String description();

}