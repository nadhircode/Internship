package com.myshop.product;

import java.util.Scanner;

public class Product {
	Scanner scan = new Scanner(System.in);
	public Product(int productId, String productName, int price) {
//		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	
public  int productId;
public  String productName;
public  int price;

	
	
}
