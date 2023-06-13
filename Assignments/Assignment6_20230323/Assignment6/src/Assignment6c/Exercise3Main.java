package Assignment6c;
import java.util.Scanner;
public class Exercise3Main {

	public static void main(String[] args) {
		String name ;
		int id;
		double salary;
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter the name of employee ");
     name=scan.next();
     System.out.println("Enter the id of employee ");
     id=scan.nextInt();
     System.out.println("Enter the salary of employee ");
     salary=scan.nextDouble();
     Employee emp1=new Employee(name,id,salary);
     System.out.println(emp1);
     
    scan.close();
	}

	}


