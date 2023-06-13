import java.util.Scanner;

public class Exercise2Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String sentence;
		String[] words;
		int counter=0;
		System.out.println("Enter the sentence: ");
		sentence=scan.nextLine();
		words=sentence.split(" ");
		for(int i=0;i<words.length;i++)
		{
			switch(words[i].charAt(0))
			{
			case 'a' : counter++;
			break;
			case 'e' : counter++;
			break;
			case 'i' : counter++;
			break;
			case 'o' : counter++;
			break;
			case 'u' : counter++;
			break;
			}
		}
		
		System.out.println("There are "+counter+" vowels in this sentence");
		
		scan.close();
		
	}

}
