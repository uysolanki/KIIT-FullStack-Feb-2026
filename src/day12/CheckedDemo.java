package day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedDemo {

	public static void main(String[] args)
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
		System.out.println("Enter Numerator");		
		int num=Integer.parseInt(br.readLine());
		System.out.println("Enter Denominator");
		int den=Integer.parseInt(br.readLine());
		
		double result=num/den;
		
		System.out.println(result);
		}
		catch(IOException e1)
		{
			System.out.println(e1.getMessage());
		}
	}

}
