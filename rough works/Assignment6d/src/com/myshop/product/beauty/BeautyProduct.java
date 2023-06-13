package com.myshop.product.beauty;

import com.myshop.product.*;

public class BeautyProduct extends Product {

	public  String expiryDate;
	public String brand;
	
	public BeautyProduct(int productId, String productName, int price, String expiryDate, String brand) {
		super(productId, productName, price);
		this.expiryDate = expiryDate;
		this.brand = brand;
	}
	
	public void printDetails()
	{
	System.out.println("Beauty product details: ");
    System.out.println("Product ID   : "+ this.productId);
    System.out.println("Product Name : "+ this.productName);
    System.out.println("Product Price: "+ this.price);
    System.out.println("Brand        : "+ this.brand);
    System.out.println("Expiry Date  : "+ this.expiryDate);
     
	}
	
	
}
