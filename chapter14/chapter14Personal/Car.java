package chapter14Personal;

public abstract class Car {
    int cylinderCount;
    int horsepower;
    int manufactureYear;
    String engineLayout;
    String make;
    String model;
    String drivetrain;

    public Car() {
	setCylinderCount(0);
	setHorsepower(0);
	setEngineLayout("null");
	setMake("null");
	setModel("null");
    }

    public int getManufactureYear() {
	return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
	this.manufactureYear = manufactureYear;
    }

    public int getCylinderCount() {
	return cylinderCount;
    }

    public void setCylinderCount(int cylinderCount) {
	this.cylinderCount = cylinderCount;
    }

    public int getHorsepower() {
	return horsepower;
    }

    public String getDrivetrain() {
	return drivetrain;
    }

    public void setDrivetrain(String drivetrain) {
	this.drivetrain = drivetrain;
    }

    public void setHorsepower(int horsepower) {
	this.horsepower = horsepower;
    }

    public String getEngineLayout() {
	return engineLayout;
    }

    public void setEngineLayout(String engineLayout) {
	this.engineLayout = engineLayout;
    }

    public String getMake() {
	return make;
    }

    public void setMake(String make) {
	this.make = make;
    }

    public String getModel() {
	return model;
    }

    public void setModel(String model) {
	this.model = model;
    }

    public abstract String getCarType();
}
