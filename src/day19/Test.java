package day19;

public class Test implements Sample,Sample2
{
	@Override
	public void newGreet() {
		System.out.println("Welcome");
		
	}

	@Override
	public void greet() {
		System.out.println("Welcome back");
		
	}
	
	@Override
	public void defaultMethod1() {
		//Sample2.super.defaultMethod1();
		System.out.println("abc");
	}

}
