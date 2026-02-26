package day12;

public class ExceptionDemo {

	public static void main(String[] args) {
		int numerator=10;
		int denominator=0;
		
		try
		{
		double result=numerator/denominator;
		
		System.out.println(result);
		}
		catch(ArithmeticException e1)
		{
			System.out.println(e1.getMessage());
		}
		
		
		System.out.println("hi");

	}

}
