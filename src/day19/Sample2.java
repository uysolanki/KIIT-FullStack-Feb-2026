package day19;

@FunctionalInterface
public interface Sample2 {

	void newGreet();		//Single Abstract Method  SAM
	
	default void defaultMethod1()
	{
		System.out.println("Default Method 2");
	}
}
