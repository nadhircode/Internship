import java.util.Scanner;

public class Exercise4Main {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int number1;
		System.out.println("Enter the number: ");
		number1=scan.nextInt();
		for (int i=1;i<=10;i++)
			System.out.println(number1+" * "+i+" ="+number1*i);

	}

}
