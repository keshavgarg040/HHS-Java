package chapter10Programs;

public class IntelComputer extends Computer {

    @Override
    public void setCPU(String CPU) {
	CPU = cpu;
    }

    public String getCPU() {
	return "Intel " + cpu;
    }

}
