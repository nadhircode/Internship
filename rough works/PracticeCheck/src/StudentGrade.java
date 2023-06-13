import java.util.Scanner;
public class StudentGrade {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int noOfStudents=scan.nextInt();
		System.out.println("Enter the number of grades");
		int noOfGrades=scan.nextInt();
		String [][] studentArray=new String[noOfStudents][noOfGrades+1];
		System.out.println("Enter the name of student and then marks ");
		for(int i=0;i<noOfStudents;i++) {
			for(int j=0;j<=noOfGrades;j++) {
				studentArray[i][j]=scan.next();
			}
		}
		
		float [] averageArray=new float [noOfStudents];
		for(int i=0;i<noOfStudents;i++)
		{float c=0;
			for(int j=1;j<=noOfGrades;j++)
		  {
            		
				c=c+Integer.parseInt(studentArray[i][j]);
		  }
		averageArray[i]=c/noOfGrades;
		}
		System.out.println("Average grades : \n");
		for(int i=0;i<noOfStudents;i++ )
		{
			System.out.print(studentArray[i][0] + ": "+averageArray[i]);
			System.out.println();
		}
		
		
	}

}
