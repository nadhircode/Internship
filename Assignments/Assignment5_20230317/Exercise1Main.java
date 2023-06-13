import java.util.Scanner;

public class Exercise1Main {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int i, num, fib = 1;
		System.out.println("Enter the number ");
		num = scan.nextInt();
		for (i = 1; i <= num; i++) {
			fib = fib * i;
			System.out.print(fib + " ");
		}

	}

}
