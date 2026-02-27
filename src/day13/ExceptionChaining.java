package day13;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionChaining {
public static void main(String[] args) {
	
	try
	{
	double totalCost=calculateTotalTilingCost();
	System.out.println("Total Tiling cost is "+totalCost);
	}
	catch(IOException e1)
	{
		System.out.println(e1.getMessage());
	}
	
}

private static double calculateTotalTilingCost()  throws IOException
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter length of the room");
	int length=sc.nextInt();
	System.out.println("Enter Width of the room");
	int width=sc.nextInt();
	System.out.println("Per Square feet rate of tile");
	int rateofTile=sc.nextInt();
	
	int area=0;
	Rectangle room=new Rectangle(length,width);
	try
	{
	area=calculateArea(null);
	}
	catch(NullPointerException ex1)
	{
		System.out.println("Log this Message for Developer : please check for the null object of Rectangle class");
		
		throw new IOException("Return this Message to Client : Please try after 5 mins");
	}
	
	return area*rateofTile;
	
	
}

private static int calculateArea(Rectangle room) throws NullPointerException
{
	return room.getLength()*room.getLength();
}
}
