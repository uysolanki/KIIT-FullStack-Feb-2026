package day13;

import java.util.Scanner;

public class ThrowsDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numerator");		
		int num=sc.nextInt();
		System.out.println("Enter Denominator");
		int den=sc.nextInt();
		try
		{
		double result=divide(num,den);
		System.out.println(result);
		}
		catch(ArithmeticException e1)
		{
			System.out.println(e1.getMessage());
		}

	}

	private static double divide(int num,int den) throws ArithmeticException 
	{
		return num/den;		
	}

}
