package com.bytes.hello;


public class Pattern1 {
	public static void main ( String args[])
	{
	for(int i=0; i<=5; i++)
	{
		System.out.print("*");
	}
	System.out.println("\n");
	for(int i=0; i<5; i++)
	{
		System.out.println("*");
	}
	System.out.println("\n");
	for(int i=0; i<5; i++)
	{
		for(int j=0; j<5;j++) 
		System.out.print("*");
		
		System.out.println("\n");
	}
	}
}
