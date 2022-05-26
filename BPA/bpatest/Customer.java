package bpatest;

public class Customer {
    String last_Name;
    String first_Name;
    String carMake;
    String carModel;
    String carLicensePlate;
    double deposit;
    String reference = "";
    public MailingAddress address;

    public Customer(String ln, String fn, String cMa, String cMo, String lp, Double de) {
	this.last_Name = ln;
	this.first_Name = fn;
	this.carMake = cMa;
	this.carModel = cMo;
	this.carLicensePlate = lp;
	this.deposit = de;
	this.address = new MailingAddress();
    }

    public String getReference() {
	return reference;
    }

    public void setReference(String reference) {
	this.reference = reference;
    }

    public double getDeposit() {
	return deposit;
    }

    public void setDeposit(double deposit) {
	this.deposit = deposit;
    }

    public String getLN() {
	return last_Name;
    }

    public void setLN(String ln) {
	last_Name = ln;
    }

    public String getFN() {
	return first_Name;
    }

    public void setFN(String fn) {
	first_Name = fn;
    }

    public String getMake() {
	return carMake;
    }

    public void setMake(String make) {
	carMake = make;
    }

    public String getModel() {
	return carModel;
    }

    public void setModel(String model) {
	carModel = model;
    }
}