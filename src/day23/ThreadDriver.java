package day23;

public class ThreadDriver {

	public static void main(String[] args) {
		Alpha t1=new Alpha();
		t1.run();     //normal function call
		
		Numeric t2=new Numeric();
		Thread tx;
		
		tx=new Thread(t2);
		tx.start();
		t1.start();
		
		
		Runnable r1=()->{
			for(int i=5000;i<=6000;i++)
				System.out.println("\t\t "+ i);
		};
		
		tx=new Thread(r1);
		tx.start();

		
		for(int i=8000;i<=9000;i++)
			System.out.println("\t\t\t "+ i);
		
		
		tx=new Thread(()->{
			for(int i=9000;i<=10000;i++)
				System.out.println("\t\t\t\t "+ i);
		});
		
		tx.start();
	}

}
