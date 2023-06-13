import java.util.Scanner;

public class Circle {
	int radius;

	Scanner scan = new Scanner(System.in);


	    public void readDetails()
	   {
		System.out.println("Enter the radius of Circle");
		radius=scan.nextInt();
	   }
	   
	    public double getPerimeter()
	    {
	    	return 2*(Math.PI)*radius;
	    }
	    
	    public double getArea()
	    {
	    	return (Math.PI)*radius*radius;
	    }
}
