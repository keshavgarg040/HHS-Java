package bpatest;

public class MailingAddress {
    String street;
    String city;
    String state;
    String zipCode;

    public MailingAddress() {
	street = "";
	city = "";
	state = "";
	zipCode = "";
    }

    public MailingAddress(String street, String city, String state, String zipcode) {
	this.street = street;
	this.city = city;
	this.state = state;
	this.zipCode = zipcode;
    }

    public String getAdd() {
	String addString = street + "\n" + city + ", " + state + " " + zipCode;
	return addString;
    }
}