package com.myshop.product.food;

import com.myshop.product.Product;

public class FoodProduct extends Product {
	
	

 

public  String expiryDate;
public  String manufacturer;
public FoodProduct(int productId, String productName, int price, String expiryDate, String manufacturer) {
	super(productId, productName, price);
	this.expiryDate = expiryDate;
	this.manufacturer = manufacturer;
}
	
public void printDetails()
{
 System.out.println("Food product details: ");
System.out.println("Product ID          : "+ this.productId);
System.out.println("Product Name        : "+ this.productName);
System.out.println("Product Price       : "+ this.price);
System.out.println("Product Expiry Date : "+ this.expiryDate);
System.out.println("Manufacturer        : "+ this.manufacturer);
}
	
	
	
}
