package Assignment6b;
import java.util.Scanner;
public class Exercise2Main {

	public static void main(String[] args) {
		
			Scanner scan=new Scanner(System.in);
			String name1;
			System.out.println("Enter the name of person");
			name1=scan.next();
			Person pers1=new Person(name1);
			System.out.println(Person.getCount());

		
	}

}
