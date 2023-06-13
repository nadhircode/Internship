import java.util.Scanner;

public class Exercise2Main {
static	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		char ch;
		String shapeName;
		Square square1 = null;
		Rectangle rectangle1 = null;
		Circle circle1 = null;
		Triangle triangle1 = null;

		do {
			System.out.println("Enter the shape :");
			shapeName=scan.next();
			
		switch(shapeName)
		{
		case "square":
			{
				square1= new Square();
				square1.readDetails();
				System.out.println(square1.getPerimeter()); 
				System.out.println(square1.getArea());
			};
			break;
		
		case "rectangle":
		    {
			rectangle1=new Rectangle();
			rectangle1.readDetails();
			System.out.println(rectangle1.getPerimeter());
			System.out.println(rectangle1.getArea());
		    };
		    break;
		case "circle":
		    {
			circle1=new Circle();
			circle1.readDetails();
			System.out.println(circle1.getPerimeter());
			System.out.println(circle1.getArea());
		    };
		    break;
		case "triangle":
	        {
		    triangle1=new Triangle();
		    triangle1.readDetails();
		    System.out.println(triangle1.getPerimeter());
		    System.out.println(triangle1.getArea());
	        };
	        break;
		default:
		    System.out.println("Invalid shape. Please try again.");
		    break;	
		}
		System.out.println("Do you want to countinue (y/n)");
		ch=scan.next().charAt(0);
		}while(ch=='y');

	}

}
