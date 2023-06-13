import java.util.Scanner;

public class Exercise8Main {
	
	public static void main(String[] args) {
		String sentence;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
        sentence=scan.nextLine();
        String[] word=sentence.split("\\s");
        System.out.println("There are "+word.length+" words in the given sentence");  
        
        scan.close();
	}

}
