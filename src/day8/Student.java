package day8;

import java.util.Scanner;

public class Student 
{

	private int rno;					//data members instance variable
	private String name;				//instance scope
	private double per;
	static int strenght;
	
	public Student()					//No Args Constructor or aka non parameterised constructor
	{
		this.rno=1;
		this.name="Unknown";
		this.per=50.0;
		strenght++;
	}
	
	public Student(int a,String b,double c)					//All Args Constructor
	{														//aka
		this.rno=a;											//Parameterised constructor
		this.name=b;
		this.per=c;
		strenght++;
	}
	
	public Student(Student temp)					//All Args Constructor
	{														//aka
		this.rno=temp.rno;											//Parameterised constructor
		this.name=temp.name;
		this.per=temp.per;
		strenght++;
	}
	
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
	
	public void displayPerson()	//non static method
	{
		System.out.println("Roll Number is "+ this.rno);
		System.out.println("Student name is "+this.name);
		System.out.println("Student Percentage is "+this.per);	
	//	System.out.println("Class Strength is "+Student.strenght);	//yes, but not recommended
	}
	
	public static void displayClassStrength()
	{
//		Student s1=new Student();
//		int k=10;  // local variable can be non static in a static method
		System.out.println("Class Strength is "+Student.strenght);	// recommended
		//System.out.println("Roll Number is "+ this.rno);
		
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
