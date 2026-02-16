package day3;

import java.util.Scanner;

public class FunctionScenerio2 {
	public static void main(String[] args)		//Very Rich man
	{
		int result=areaOfRectangle();						//call
		System.out.println("Area of Rectangle is "+result);	//serving
	}
	
	
	public static int areaOfRectangle()		//honest caterer
	{
		
	int length,width;	//mutter paneer
	
	Scanner sc=new Scanner(System.in);						//buy good quality raw material
	System.out.println("Enter Length of Rectangle");
	length=sc.nextInt();
	
	System.out.println("Enter Width of Rectangle");
	width=sc.nextInt();
	
	
	int area=length*width;									//cooking  4 bytes
	
	return(area);
	}
}
