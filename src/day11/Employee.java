package day11;

import java.util.Scanner;

public class Employee extends Person 
{
	private int eno;
	private String desg;
	private double salary;
	
	public Employee()		//implicity the sub class constructor invokes the no args() of the super class
	{
//		super();  		
		eno=101;
		desg="Associate";
		salary=1000.0;
	} 
	
	public Employee(long adharNumber, String name, int age)
	{
		this.adharNumber=adharNumber;
		this.name=name;
		this.age=age;
	}
	
	public Employee(long adharNumber, String name, int age,int eno, String desg, double salary) 	//all args construtor of sub class
	{
		//super(adharNumber,name,age);		//implicity the sub class constructor invokes the no args() of the super class
		this(adharNumber,name,age);
		this.eno = eno;
		this.desg = desg;
		this.salary = salary;
	}

	public void acceptEmployee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Emp Number");
		this.eno=sc.nextInt();
	
		System.out.println("Enter Emp Designation");
		this.desg=sc.next();
		
		System.out.println("Enter Emp Salary");
		this.salary=sc.nextDouble();	
	}
	
	public void displayEmployee()
	{
		super.displayPerson();
		System.out.println("Employee Number is "+ this.eno);
		System.out.println("Employee Designation is "+this.desg);
		System.out.println("Employee Salary is "+this.salary);	
	}
}
