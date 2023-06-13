import java.util.Scanner;

public class Exercise6Main {

	public static void main(String[] args) {
		int c = 0;
		String word;
		System.out.println("Enter the word");
		Scanner scan = new Scanner(System.in);
		word = scan.next();
		for (int i = 0, j = word.length() - 1; i <= j; i++, j--) {
			if (word.charAt(i) != word.charAt(j))
			{	System.out.println("The word is not a pallindrome");
			c++;
			break;}
		};
		if (c == 0)
			System.out.println("The word is a pallindrome ");

	}

}
