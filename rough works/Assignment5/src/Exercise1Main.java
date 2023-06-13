import java.util.Scanner;

public class Exercise1Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String sentence,word1;
		String[] words;
		int counter=0;
		System.out.println("Enter the sentence :");
        sentence=scan.nextLine();
        System.out.println("Enter the word to be searched :");
        word1=scan.next();
        words=sentence.split(" ");
       for(int i=0;i<words.length;i++)
    	   if(word1.equalsIgnoreCase(words[i]))
    	   { System.out.println("The word '"+word1+"' is present in sentence as "+(i+1)+"th word");
    	   counter++;
    	   break;
    	   
    	   }
       
       if(counter==0)
       {
    	   System.out.println("The entered word is not present in sentence");
       }
    	   
	
	scan.close();
	
	}

}
