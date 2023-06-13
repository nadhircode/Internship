import java.util.Scanner;

public class Triangle {
	int side1,side2,side3;
	float S;

	Scanner scan = new Scanner(System.in);


	    public void readDetails()
	   {
		System.out.println("Enter the 1st side of triangle");
		side1=scan.nextInt();
		System.out.println("Enter the 2nd side of triangle");
		side2=scan.nextInt();
		System.out.println("Enter the 3rd side of triangle");
		side3=scan.nextInt();
		
	   }
	    
	   
	    public int getPerimeter()
	    {
	    	return side1+side2+side3;
	    }
	    
	    public float getArea()
	    {
	    	S=(side1+side2+side3)/2;
	    	return Math.sqrt(S*(S-side1)*(S-side2)*(S-side3))
	    }
}
