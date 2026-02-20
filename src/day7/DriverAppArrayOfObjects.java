package day7;

import java.util.Scanner;

public class DriverAppArrayOfObjects {

	public static void main(String[] args) {

		Student batch[]=new Student[3];
		
		for(int i=0;i<batch.length;i++)
			batch[i]=new Student();
		
		
		for(int i=0;i<batch.length;i++)
			batch[i].acceptPerson();
		
		
		for(int i=0;i<batch.length;i++)
			System.out.println(batch[i]);
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll Number to Search");
		int searchRno=sc.nextInt();		//102
		int i;
		for(i=0;i<batch.length;i++)
		{
			boolean result=batch[i].search(searchRno);		//102 ==102				i=1
			if(result==true)
			{
				System.out.println("Found");
				break;
			}
		}
		if(i==batch.length)
		{
			System.out.println("Not Found");
		}
		
		
		System.out.println("Enter Name to Search");
		String searchName=sc.next();		//102
		for(i=0;i<batch.length;i++)
		{
			boolean result=batch[i].search(searchName);		//102 ==102				i=1
			if(result==true)
			{
				System.out.println("Found");
				break;
			}
		}
		if(i==batch.length)
		{
			System.out.println("Not Found");
		}
		
		

	}

}
