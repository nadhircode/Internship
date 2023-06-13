
public class StudentOb {
	
	int rollNo;
	String name;
	int totalMarks;
	boolean isPassed;
	
	StudentOb(int roll)
	{
		this.rollNo=roll;
	}
	StudentOb(int roll, String name1)
	{
		this.rollNo=roll;
		this.name=name1;
	}
	
	public void setMark(int mark1)
	{
		this.totalMarks=mark1;
	}
	
     public void result()
     {
    	 if(this.totalMarks>50)
    		 System.out.println("The student have passed");
    	 else
    		 System.out.println("The student have failed");
     }
}
