package day12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("Enter Numerator");		//apple
		int num=sc.nextInt();
		System.out.println("Enter Denominator");
		int den=sc.nextInt();
		
		
		double result=num/den;
		
		System.out.println(result);
		}
		catch(ArithmeticException | InputMismatchException e1)
		{
			System.out.println("Please enter non zero integer values only");
		}
		
		
		
		System.out.println("hi");

	}

}
