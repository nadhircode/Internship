import java.util.Scanner;

public class Rectangle {
int length, breadth;

Scanner scan = new Scanner(System.in);


    public void readDetails()
   {
	System.out.println("Enter the length of rectangle");
	length=scan.nextInt();
	System.out.println("Enter the breadth of rectangle");
	breadth=scan.nextInt();
   }
   
    public int getPerimeter()
    {
    	return 2*(length+breadth);
    }
    
    public int getArea()
    {
    	return length*breadth;
    }

}
