import java.util.Scanner;

public class Square {

	int length;

	Scanner scan = new Scanner(System.in);


	    public void readDetails()
	   {
		System.out.println("Enter the length of Square");
		length=scan.nextInt();
	   }
	   
	    public int getPerimeter()
	    {
	    	return 4*length;
	    }
	    
	    public int getArea()
	    {
	    	return length*length;
	    }
}
