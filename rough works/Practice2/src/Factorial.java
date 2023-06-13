import java.util.Scanner;

public class Factorial {
	static Scanner scan = new Scanner(System.in);
	
	 public static int factoria(int num){
		 if (num==0)
			 return 1;
		 else
		 return num*factoria(num-1);
		 }
	 
	public static void main(String[] args) {
		int fact=1, num;
	System.out.println("Enter the number");
	 num=scan.nextInt();
	 System.out.println("The factorial of "+num+" is "+ factoria(num));

	}

}
