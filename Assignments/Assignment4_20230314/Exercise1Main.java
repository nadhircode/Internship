import java.util.Scanner;

public class Exercise1Main {
static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number of students");
	int noOfStudents=scan.nextInt();
	Student[] student1= new Student[noOfStudents];
	for (int i = 0; i < student1.length; i++) {
	    student1[i] = new Student(); // initialize each element with a new Student object
	    student1[i].readDetails(); // call the readDetails method on each element
	}
	System.out.println("The average grades are: ");
	for(int i=0;i<noOfStudents;i++)
	System.out.println(student1[i].name +" :"+ student1[i].avgMark());
	
	
	
	
	
	
	
	
	
	
	
	}

}
