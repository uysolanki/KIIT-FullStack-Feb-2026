package day23;

public class ThreadDriver2 {

	public static void main(String[] args) {
		Alpha t1=new Alpha();
		t1.run();    		
		
		Numeric t2=new Numeric();
		Thread tx=new Thread(t2);
		
		tx.run();
		
	}

}
