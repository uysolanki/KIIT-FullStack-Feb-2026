//calculate area of circle
package day2;

import java.util.Scanner;

public class Test {

	static Test t1=new Test();
	public static void main(String[] args)		//Very Rich man
	{
		t1.areaOfRectangle();						//call
	}
	
	
	public void areaOfRectangle()		//5 * hotel
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
	
	
	public static void areaOfCircle()
	{
		
//	int radius;
//	length=10;			hard coded values
//	width=5;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Radius of Circle");
	int radius=sc.nextInt();
	
	double area=Math.PI*radius*radius;
	
	System.out.println("Area of Circle is "+area);
	}

}
