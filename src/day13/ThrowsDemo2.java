package day13;

import java.util.Scanner;

public class ThrowsDemo2 {

	public static void main(String[] args) {
		
		divide();

	}

	private static void divide() {
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("Enter Numerator");		
		int num=sc.nextInt();
		System.out.println("Enter Denominator");
		int den=sc.nextInt();
		
		
		double result=num/den;
		
		System.out.println(result);
		}
		catch(ArithmeticException e1)
		{
			System.out.println(e1.getMessage());
		}
		
	}

}
