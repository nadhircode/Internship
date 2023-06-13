import java.util.Scanner;

public class Exercise7Main {

	public static void main(String[] args) {
	  Scanner scan= new Scanner(System.in);
	  System.out.println("Enter the name of student");
	  String name1=scan.next();
	  System.out.println("Enter the Roll number of the student");
	  int roll=scan.nextInt();
	  StudentOb stud1=new StudentOb(roll);
	  StudentOb stud2=new StudentOb(roll,name1);
	  System.out.println("Enter the total marks");
	  int Mark1=scan.nextInt();
	  stud1.setMark(Mark1);
	  stud1.result();
	  
	  }

}
