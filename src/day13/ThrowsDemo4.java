package day13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsDemo4 {

	public static void main(String[] args) 
	{
		try
		{
		double ans=divide();
		}
		catch(ArithmeticException e1)
		{
			System.out.println(e1.getMessage());
		}
		
		catch(InputMismatchException e2)
		{
			System.out.println("Please enter integer values only");
		}
	}

	private static double divide() throws InputMismatchException, ArithmeticException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numerator");		//10	
		int num=sc.nextInt();
		System.out.println("Enter Denominator");	//0
		int den=sc.nextInt();
		return num/den;
	
	}

}
