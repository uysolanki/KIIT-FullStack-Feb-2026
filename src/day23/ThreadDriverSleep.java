package day23;

public class ThreadDriverSleep {

	public static void main(String[] args) {
		Alpha t1=new Alpha();
		t1.start();    		
		
		Numeric t2=new Numeric();
		Thread tx=new Thread(t2);
		
		tx.start();
		
	}

}
