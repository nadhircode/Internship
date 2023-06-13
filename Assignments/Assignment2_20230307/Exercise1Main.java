import java.util.Scanner;

public class Exercise1Main {
static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		int number1,number2, quotient;
		System.out.println("Enter the first number");
        number1=scan.nextInt();
		System.out.println("Enter the first number");
		number2=scan.nextInt();
		quotient=number1/number2;
		System.out.println("The quotient of given two numbers are "+quotient);
	}

}
