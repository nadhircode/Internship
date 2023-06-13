package main;

public class Item {
static int itemID;
String itemName;
String brandName;
int quantity;
int price;
public Item( String itemName, String brandName, int price) {
	super();
	itemID++;
	this.itemName = itemName;
	this.brandName = brandName;
	this.price = price;
}

}
