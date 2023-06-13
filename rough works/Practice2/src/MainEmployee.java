
public class MainEmployee {

	public static void main(String[] args) {
		Employee emplo1 = new Employee(0,0,"noName");
	    Employee emplo2 = new Employee(0,0,"noName");
		System.out.println("Enter the details of 1st employee");
		emplo1.read();
		System.out.println("Enter the details of 2nd employee");
		emplo2.read();
		if(emplo1.isEqual(emplo2))
			System.out.println("The two objects are same ");
		else
			System.out.println("The two objects are different");
		
		
	}

}
