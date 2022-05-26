package bpapractice;

public class CardBalance {
    private double balance;
    private String reloadID = "";

    public CardBalance() {
	balance = 0;
    }

    public CardBalance(double balance) {
	this.balance = balance;
    }

    public String getReloadID() {
	return reloadID;
    }

    public void setReloadID(String reloadID) {
	this.reloadID = reloadID;
    }

    public double getBalance() {
	return balance;
    }

    public void setBalance(double balance) {
	this.balance = balance;
    }
}