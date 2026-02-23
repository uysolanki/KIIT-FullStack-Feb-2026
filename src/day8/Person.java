package day8;

import java.util.Scanner;

public class Person {

	protected long adharNumber;
	protected String name;
	protected int age;
	
	public Person() {}
	public Person(long adharNumber, String name, int age) 
	{
		this.adharNumber = adharNumber;
		this.name = name;
		this.age = age;
	}
	public long getAdharNumber() {
		return adharNumber;
	}
	public void setAdharNumber(long adharNumber) {
		this.adharNumber = adharNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [adharNumber=" + adharNumber + ", name=" + name + ", age=" + age + "]";
	}
	
	public void acceptPerson()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Adhar Number");
		this.adharNumber=sc.nextLong();
	
		System.out.println("Enter Person name");
		this.name=sc.next();
		
		System.out.println("Enter Person Age");
		this.age=sc.nextInt();	
	}
	
	public void displayPerson()
	{
		System.out.println("Adhar Number is "+ this.adharNumber);
		System.out.println("Name is "+this.name);
		System.out.println("Age is "+this.age);	
	}
	
}
