package main;

public class Bill {

	int billNo;
	Order order;
	int totalAmount;
	public Bill(int billNo, Order order, int totalAmount) {
		super();
		this.billNo = billNo;
		this.order = order;
		this.totalAmount = totalAmount;
	}
	
	public Bill getBill(int billNo, Order order, int totalAmount) {
	 return new Bill(billNo,order,totalAmount);
		
		
	}
	
	
}
