package day12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryDemo {

	public static void main(String[] args) {
															//0				1
		int arr[]=new int[2];								//100 			0
		
		Scanner sc=new Scanner(System.in);				
		try
		{
		System.out.println("Enter value for index zero");		
		arr[0]=sc.nextInt();
		
		System.out.println("Enter value for index one");		
		arr[1]=sc.nextInt();
		
							try
							{
							System.out.println("Enter index of Numerator number");	//apple
							int numIndex=sc.nextInt();	//numIndex=0
							int numerator=arr[numIndex];
							
							System.out.println("Enter index of Denominator number");	//1
							int denIndex=sc.nextInt();	//denIndex=0
							int denominator=arr[denIndex];
							
							double result=numerator/denominator;
							
							System.out.println("Result "+result);
							}
							catch(ArrayIndexOutOfBoundsException e1)
							{
								System.out.println("Please enter 1 & 0 only");
							}
							
							catch(ArithmeticException e2)
							{
								System.out.println(e2.getMessage());
							}
						
		}
		catch(InputMismatchException e2)
		{
			System.out.println("Please enter integer values only");
		}

	}

}
