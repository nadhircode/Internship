import java.util.Scanner;

public class Exercise3Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String choice1;

		System.out.println("Enter point or line");
		choice1 = scan.next();
		if (choice1.equals("point")) {
			System.out.println("Enter the 1st point");
			System.out.println("Enter the x-cordinate ");
			float x1 = scan.nextFloat();
			System.out.println("Enter the Y-cordinate ");
			float y1 = scan.nextFloat();
			Point point1 = new Point(x1, y1);

			System.out.println("Enter the 2nd point");
			System.out.println("Enter the x-cordinate ");
			float x2 = scan.nextFloat();
			System.out.println("Enter the Y-cordinate ");
			float y2 = scan.nextFloat();
			Point point2 = new Point(x2, y2);

			if (point1.arePointEqual(point2))
				System.out.println("The points are equal");
			else
				System.out.println("The two points are'nt equal");
		}

		else if (choice1.equals("line")) {
			System.out.println("Enter the 1st point of 1st Line");
			System.out.println("Enter the x-cordinate ");
			float x1 = scan.nextFloat();
			System.out.println("Enter the Y-cordinate ");
			float y1 = scan.nextFloat();
			System.out.println("Enter the 2nd point of 1st Line");
			System.out.println("Enter the x-cordinate ");
			float x2 = scan.nextFloat();
			System.out.println("Enter the Y-cordinate ");
			float y2 = scan.nextFloat();
			Line Line1 = new Line(x1, y1, x2, y2);

			System.out.println("Enter the 1st point of 2nd Line");
			System.out.println("Enter the x-cordinate ");
			float x3 = scan.nextFloat();
			System.out.println("Enter the Y-cordinate ");
			float y3 = scan.nextFloat();
			System.out.println("Enter the 2nd point of 2nd Line");
			System.out.println("Enter the x-cordinate ");
			float x4 = scan.nextFloat();
			System.out.println("Enter the Y-cordinate ");
			float y4 = scan.nextFloat();
			Line Line2 = new Line(x3, y3, x4, y4);

			if (Line1.isLinesEqual(Line2))
				System.out.println("The Lines are equal");
			else
				System.out.println("The two Lines are'nt equal");

			System.out.println("The length of 1st line is " + Line1.length());
			System.out.println("The length of 2nd line is " + Line2.length());
		} else
			System.out.println("Wrong input");

	}

}
