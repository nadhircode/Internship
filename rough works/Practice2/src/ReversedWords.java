import java.util.Scanner;

public class ReversedWords {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);	
		String sentence;
		System.out.println("Enter the sentence ");
        sentence=scan.nextLine();
        String[] word=sentence.split(" ");
        for(int i=0;i<word.length;i++)
        {
        	word[i]=new StringBuilder(word[i]).reverse().toString();
        }
        
       System.out.println("The new sentence is ");
       for(int i=0;i<word.length;i++)
    	   System.out.print(word[i]+" ");
        
	}

}
