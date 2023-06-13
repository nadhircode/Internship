package main;

public class Address {
String street;
String city;
String state;
int postalCode;
String country;

public Address(String street, String city, String state, int postalCode, String country) {
	super();
	this.street = street;
	this.city = city;
	this.state = state;
	this.postalCode = postalCode;
	this.country = country;
}

public Address getAddress(String street, String city, String state, int postalCode, String country) {
	
	return new Address(street, city , state, postalCode,country);
	
	
	
}
}
