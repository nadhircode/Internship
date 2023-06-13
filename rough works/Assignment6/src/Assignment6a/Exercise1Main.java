package Assignment6a;
import java.util.Scanner;


public class Exercise1Main {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		MathUtils math1=new MathUtils();
		int num1,num2;
		System.out.println("Enter the 1st number");
		num1=scan.nextInt();
		System.out.println("Enter the 2nd number");
		num2=scan.nextInt();
		System.out.println("The product of two given numbers are: "+MathUtils.multiply(num1, num2));
		scan.close();
	}

}
