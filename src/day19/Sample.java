package day19;

@FunctionalInterface
public interface Sample {

	void greet();		//Single Abstract Method  SAM
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	default void defaultMethod1()
	{
		System.out.println("Default Method 1");
	}
	
	default void defaultMethod2()
	{
		System.out.println("Default Method 1");
	}
	
	static void staticMethod1()
	{
		System.out.println("Static Method 1");
	}
	
	static void staticMethod2()
	{
		System.out.println("Static Method 2");
	}
}
