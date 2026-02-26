package day12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("Enter Numerator");		//apple
		int num=sc.nextInt();
		System.out.println("Enter Denominator");
		int den=sc.nextInt();
		
		String name=null;
		System.out.println(name.length());
		
		double result=num/den;
		
		System.out.println(result);
		}
		
		catch(ArithmeticException e1)
		{
			System.out.println(e1.getMessage());
		}
		
		catch(InputMismatchException e2)
		{
			System.out.println("Please enter integer values only");
		}
		
		catch(Exception e3)
		{
			System.out.println("some exception occured");
		}
		
		System.out.println("hi");

	}

}
