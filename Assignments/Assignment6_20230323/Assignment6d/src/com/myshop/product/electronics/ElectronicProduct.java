package com.myshop.product.electronics;

import com.myshop.product.Product;

public class ElectronicProduct extends Product {
	
	public 	String brand;
	public 	int warranty;

	public ElectronicProduct(int productId, String productName, int price,String brand, int warranty) {

		super(productId,  productName,  price);
		this.brand = brand;
		this.warranty = warranty;
	}
	
public void printDetails()
{
System.out.println("Electronic product details: ");
System.out.println("Product ID   : "+ this.productId);
System.out.println("Product Name : "+ this.productName);
System.out.println("Product Price: "+ this.price);
System.out.println("Brand        : "+ this.brand);
System.out.println("Warranty     : "+ this.warranty);
  
}
	
	
}
