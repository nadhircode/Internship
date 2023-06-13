package com.bytes.hello;

public class Pattern5 {

	public static void main(String[] args)
	{
		pattern6(10);
		
	    }
		
		static void pattern5(int n)
		{
		for(int row=0;row<n*2;row++)
		  {
			int totalColsInRow =row>n?2*n-row:row;
			for(int col=0;col<totalColsInRow;col++)
				System.out.print("* ");
			System.out.println();
		  }
		}
		
		static void pattern6(int n)
		{
		for(int row=0;row<n*2;row++)
		  {
			int totalColsInRow =row>n?2*n-row:row;
			int noOfSpaces=n-totalColsInRow;
			for(int s=0;s<noOfSpaces;s++)
				System.out.print(" ");
			for(int col=0;col<totalColsInRow;col++)
				System.out.print("* ");
			System.out.println();
		  }
	}

}
