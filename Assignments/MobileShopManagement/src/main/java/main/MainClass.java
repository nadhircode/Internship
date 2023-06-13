package main;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		
		List<Item>availableItems = new ArrayList<Item>();
		availableItems.add(new Item("note7Pro","xiaomi",17000));
		availableItems.add(new Item("GalaxyS8","Samsung",15000));
		availableItems.add(new Item("P10lite","Huwaei",21000));
		availableItems.add(new Item("12Pro","Apple",58000));
		availableItems.add(new Item("note10","xiaomi",18000));
		availableItems.add(new Item("Edge30","Motorola",25000));
		availableItems.add(new Item("S23Ultra","Samsung",130000));
		
		// Mobile Shop Management MENU
        System.out.println();
		System.out.println("Mobile Shop MANAGEMENT SYSTEM:");
		System.out.println();
		System.out.println("1.Add New Employee.");
		System.out.println("2.Update Employee Details.");
		System.out.println("3.Display Employee Details.");
		System.out.println("4.Sort Employee Details.");
		System.out.println("5.Search Employee Details.");
		System.out.print("Enter your Choice(1,2,3,4,5): ");
		int ch = scan.nextInt();
		
		

	}

}
