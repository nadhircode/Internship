package main;

public class Customer {
	
	
    public Customer() {
		super();
		customerID++;
	}

	static int customerID=1;
	String name;
	int phoneNumber;
	String email;
	Address address;
	
	public void orderPhone() {
		Order order= new Order();
		order.customerID=customerID;
		
	}
}
