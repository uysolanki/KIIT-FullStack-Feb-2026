package day13;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Abhishek extends Amitabh
{
	
//	@Override  				
//	public void home()	
//	{
//		Scanner sc=new Scanner(System.in);
////		System.out.println("Jalsa");
//		int arr[]= {10,20};
//		
//		System.out.println("enter index to check"); //2
//		int n=sc.nextInt();
//		
//		System.out.println(arr[n]);
//	}
	
//	@Override  				
//	public void home()	throws IOException
//	{
//		System.out.println("New Jalsa");
//	}
	
//	@Override  				
//	public void home()	throws FileNotFoundException
//	{
//		System.out.println("New Jalsa");
//	}
	
	
	@Override  				
	public void home()throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Jalsa");
		int arr[]= {10,20};
		
		System.out.println("enter index to check"); //2
		int n=sc.nextInt();
		
		System.out.println(arr[n]);
	}
}
