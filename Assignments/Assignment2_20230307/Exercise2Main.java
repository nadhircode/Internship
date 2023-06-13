import java.util.Scanner;

public class Exercise2Main {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int number1,number2;
		System.out.println("Enter the first number: ");
		number1=scan.nextInt();
		System.out.println("Enter the second number: ");
		number2=scan.nextInt();
		System.out.println(number1+"*"+number2+" ="+number1*number2);
	}

}
