package day12;

import java.util.Scanner;

public class UncheckedDemo {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Numerator");		//apple
		int num=sc.nextInt();
		System.out.println("Enter Denominator");
		int den=sc.nextInt();
		
		double result=num/den;
		
		System.out.println(result);
	}

}
