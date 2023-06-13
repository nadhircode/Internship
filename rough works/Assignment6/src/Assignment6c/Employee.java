package Assignment6c;

public class Employee {
	String name ;
	int id;
	private double salary;
	
	public Employee(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}
    
	public void giveRise()
	{
		this.salary=this.salary+(this.salary*0.1);
	}

}
