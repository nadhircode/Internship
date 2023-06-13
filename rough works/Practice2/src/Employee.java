import java.util.Scanner;

public class Employee {
	Scanner scan= new Scanner(System.in);
	int id;
	int age;
    String name;
    AddressEmp address=new AddressEmp();
    Employee(int id1,int age1, String name1)
    {
    	id=id1;
    	age=age1;
    	name=name1;
    }
    
    public void read()
    {
    	System.out.println("Enter the id ");
    	id=scan.nextInt();
    	System.out.println("Enter the Name ");
    	name=scan.next();
    	System.out.println("Enter the age ");
    	age=scan.nextInt();
    	System.out.println("Enter the building no. ");
    	address.buildingNo=scan.nextInt();
    	System.out.println("Enter the street ");
    	address.street=scan.next();
    	System.out.println("Enter the district ");
    	address.district=scan.next();
    	System.out.println("Enter the state ");
    	address.state=scan.next();
    	
    }
    
    public boolean isEqual(Employee emp2)
    {
    	if((this.id==emp2.id)&&(this.name.equals(emp2.name))&&(this.age==emp2.age)
    			&&(this.address.buildingNo==emp2.address.buildingNo)&&(this.address.district.equals(emp2.address.district))
    			&&(this.address.street.equals(emp2.address.street))&&(this.address.state.equals(emp2.address.state))
    			
    	   )
    		return true;
    	else 
    		return false;
    	
    		
    		
    }
    
}
