import java.util.Scanner;

import com.myshop.product.beauty.*;
import com.myshop.product.electronics.*;
import com.myshop.product.food.*;


public class Exercise4Main {
	static Scanner scan = new Scanner(System.in);
	public  static int productId;
	  static String productName;
	  static int price;
	  static String expiryDate1;
	  static String manufacturer;
	  static  String expiryDate2;
	  static String brand1;
	  static String brand2;
      static int warranty1;

	public static void main(String[] args) {
		
		System.out.println("What kind of product is it? \n 1. Food product \n 2. Beauty Product \n 3. Electronic Product");
		int choice=scan.nextInt();
		readPrdtDetails();
		switch(choice)
		{
		case 1:readFoodPrdtDetails();
		       FoodProduct foodPdt=new FoodProduct(productId,productName,price,expiryDate1,manufacturer);
		       foodPdt.printDetails();
		       
		break;
		case 2: readBeautyPrdtDetails();
		       BeautyProduct beautyPdt=new BeautyProduct(productId, productName,price,expiryDate2,brand1);
		       beautyPdt.printDetails();
		break;
		case 3:readElectPrdtDetails();
		       ElectronicProduct ElecPdt=new ElectronicProduct(productId,productName,price,brand2,warranty1);
		       ElecPdt.printDetails();
		break;
		default: System.out.println("Wrong input");
		}
		

	}
	public static  void	readPrdtDetails()
	{
		System.out.println("Enter the product ID");
		productId=scan.nextInt();
		System.out.println("Enter the product Name");
		productName=scan.next();
		System.out.println("Enter the product price");
		price=scan.nextInt();
	}


 public static void	readFoodPrdtDetails()
	{
		System.out.println("Enter the Expiry date of food product ");
		expiryDate1=scan.next();
		System.out.println("Enter the manufacturer Name of food product");
		manufacturer=scan.next();
	}
 public static void	readBeautyPrdtDetails()
{
	System.out.println("Enter the Expiry date of Beauty product ");
	expiryDate2=scan.next();
	System.out.println("Enter the brand Name of beauty product");
	brand1=scan.next();
}
 public static void	readElectPrdtDetails()
{
	System.out.println("Enter the brand of electronic product ");
	brand2=scan.next();
	System.out.println("Enter the warranty of product");
	warranty1=scan.nextInt();
}
 
 

}
