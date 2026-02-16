package day3;

import java.util.Scanner;

public class FunctionScenerio1 {
	public static void main(String[] args)		//Very Rich man
	{
		areaOfRectangle();						//call
	}
	
	
	public static void areaOfRectangle()		//5 * hotel
	{
		
	int length,width;	//mutter paneer

	
	Scanner sc=new Scanner(System.in);						//buy
	System.out.println("Enter Length of Rectangle");
	length=sc.nextInt();
	
	System.out.println("Enter Width of Rectangle");
	width=sc.nextInt();
	
	
	int area=length*width;									//cooking
	
	System.out.println("Area of Rectangle is "+area);		//serving
	}
}
