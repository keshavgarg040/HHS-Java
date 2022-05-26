package chapter10Programs;

public class AMDComputer extends Computer {

    @Override
    public void setCPU(String CPU) {
	CPU = cpu;
    }

    public String getCPU() {
	return "AMD " + cpu;
    }

}
