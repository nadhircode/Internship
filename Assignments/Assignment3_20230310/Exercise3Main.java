package com.bytes.hello;

import java.util.Scanner;

public class Exercise3Main
{
	public static void main(String[] args)
	{
		int noArray1=0;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number of elements");
		noArray1=scan.nextInt();
	    int noArray2=0;
		int[] myArray = new int[noArray1];
	    int[] uniqueArray= new int[noArray1];
		System.out.println("Enter all the elements ");
		for(int i=0;i<noArray1;i++)
			myArray[i]=scan.nextInt();
		for(int i=0;i<noArray1;i++)
		{int c=-1;
			for(int j=0; j<=noArray2;j++)
				if (myArray[i]==uniqueArray[j])
					c = i;
			if(c==-1)
			{
				 uniqueArray[noArray2] = myArray[i];
				 noArray2++;  
			}
			
		}
		System.out.println("The Unique Array is \n");
		for(int i=0;i<noArray2; i++)
		System.out.println(uniqueArray[i]);
	}

}