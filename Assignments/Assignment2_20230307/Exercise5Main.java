import java.util.Scanner;

public class Exercise5Main {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String word1,word2;
		System.out.println("Enter the first word: ");
		word1=scan.next();
		System.out.println("Enter the second word: ");
		word2=scan.next();
		System.out.println(word1+" "+word2);
		scan.close();

	}

}
