package com.bytes.hello;

import java.util.Scanner;

public class ArrayEvenSum {

	public static void main(String[] args) 
	{
	int noArray = 0, sum=0;
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the number of elements");
	noArray=scan.nextInt();
	int[] myArray = new int[noArray];
	for(int i=0; i<noArray;i++)
	{
		System.out.println("Enter " +(i+1)+"th number");
		myArray[i]=scan.nextInt();
	}
	for(int i=0; i<noArray;i++)
		if(myArray[i]%2==0)
			sum+=myArray[i];
	
	System.out.println("The sum of Even element are "+ sum);
	

	}

}
