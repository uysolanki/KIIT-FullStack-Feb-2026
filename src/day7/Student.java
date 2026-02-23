package day7;

import java.util.Scanner;

public class Student 
{

	private int rno;
	private String name;
	private double per;
	
	
	
	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPer() {
		return per;
	}

	public void setPer(double per) {
		this.per = per;
	}

	public void acceptPerson()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll Number");
		rno=sc.nextInt();
	
		System.out.println("Enter Student name");
		name=sc.next();
		
		System.out.println("Enter Student Percentage");
		per=sc.nextDouble();	
	}
	
	public void displayPerson()
	{
		System.out.println("Roll Number is "+ rno);
		System.out.println("Student name is "+name);
		System.out.println("Student Percentage is "+per);	
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", per=" + per + "]";
	}

	public boolean search(int searchRno) 
	{
			if(this.rno==searchRno)
			return true;
			else
			return false;
		
	}

	public boolean search(String searchName) {					//Ben     ben
		if(this.name.equalsIgnoreCase(searchName))
			return true;
			else
			return false;
	}

	
	
	
}
