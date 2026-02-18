package day5;

import java.util.Scanner;

public class ArrayDemo {
	
	public static void main(String[] args) {
			int arr[]=new int[7];  //array declaration of size 5
			
			//int arr1[]= {10,20,30};  //array declare + initialize
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter 5 numbers");
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
			}
			
//			for(int i=0;i<arr.length;i++)
//			{
//				System.out.println(arr[i]);
//			}
			
			for(int n:arr)					//foreach loop  or enhanced for loop  iterable  
				System.out.println(n);
			
			
			int sum=0;
			for(int n:arr)
				sum+=n;
			System.out.println(sum);
			
			
	
	}
}
