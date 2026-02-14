//calculate area of circle
package day2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args)
	{
		areaOfRectangle();
	}
	
	
	public static void areaOfRectangle()
	{
		
	int length,width;
//	length=10;			hard coded values
//	width=5;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Length of Rectangle");
	length=sc.nextInt();
	
	System.out.println("Enter Width of Rectangle");
	width=sc.nextInt();
	
	
	int area=length*width;
	
	System.out.println("Area of Rectangle is "+area);
	}

}
