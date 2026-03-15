package day23;

public class ThreadDriverPriority {

	public static void main(String[] args) 
	{
		Alpha t1=new Alpha();
		System.out.println(t1.getPriority());               //1-MIN_PRIORITY   5-NORM_PRIORITY  10-MAX_PRIORITY
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();    		
		
		Numeric t2=new Numeric();
		Thread tx=new Thread(t2);
		tx.setPriority(5);
		tx.start();
		
	}

}
