package day13;

import java.io.IOException;
import java.util.Scanner;

public class ThrowsDemo3 {

	public static void main(String[] args) throws IOException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numerator");		
		int num=sc.nextInt();
		System.out.println("Enter Denominator");
		int den=sc.nextInt();
		
		double result=divide(num,den);
		System.out.println(result);
		}
		

	private static double divide(int num,int den) throws IOException 
	{
		return num/den;		
	}

}
