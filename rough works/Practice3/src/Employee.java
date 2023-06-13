
public class Employee {

private	long id;
private	String firstName;
private	String lastName;
private	int age;
 public Employee(long id, String fistName, String lastName)
 {
	 this.id=id;
	 this.firstName=firstName;
	 this.lastName=lastName;
 }
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
	
	
	
}
