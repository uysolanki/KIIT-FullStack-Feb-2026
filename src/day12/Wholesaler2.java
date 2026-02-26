package day12;

import java.util.Scanner;

public class Wholesaler2 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Quantity");		
	int qty=sc.nextInt();
	try
	{
	if(qty>=500)
		System.out.println("Order Accepted");
	else
		throw new LowQtyException("Please enter quantity greater than 500");
	
	return;
	}
	catch(LowQtyException e1)
	{
		System.out.println(e1.getMessage());
		return;
	}
	
	finally
	{
		System.out.println("Thank you, Visit Again");
	}
	
}
}

// if the code has entered try, it has to 101% entry the finally block
