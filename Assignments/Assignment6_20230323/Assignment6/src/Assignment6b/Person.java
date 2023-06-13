package Assignment6b;

public class Person {
	static int count=0;

	static
	{
		count++;
	}
	String name;
	
	Person(String name1)
	{
		this.name=name1;
	}
	static int getCount()
	{
		return count;
	}
}
