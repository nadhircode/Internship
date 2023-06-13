package main;

import java.util.ArrayList;
import java.util.List;

public class Order {
	

	public Order() {
		super();
		orderID++;
	}
	
	static int orderID=0;
	int customerID;
	List<Item>items = new ArrayList<Item>();
	
	public void addItem() {
		Item item=new Item();
		items.add(item);
		
	}

}
