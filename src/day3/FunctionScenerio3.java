package day3;

import java.util.Scanner;

public class FunctionScenerio3 {
	public static void main(String[] args)		//common man
	{
		int length,width;	//mutter paneer
		
		Scanner sc=new Scanner(System.in);						//buy good quality raw material
		System.out.println("Enter Length of Rectangle");
		length=sc.nextInt();
		
		System.out.println("Enter Width of Rectangle");
		width=sc.nextInt();										//buy
		
		int result=areaOfRectangle(length,width);				//call - actual parameter/arguements
		System.out.println("Area of Rectangle is "+result);		//serving
	}
	
	
	public static int areaOfRectangle(int l,int w)		//dishonest caterer - formal parameter
	{													//datatype of actual & formal parameters same
	int area=l*w;										//cooking  4 bytes
	
	return(area);
	}
}
