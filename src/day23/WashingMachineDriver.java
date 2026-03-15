package day23;

public class WashingMachineDriver {
public static void main(String[] args) throws InterruptedException {
	Soak thread1=new Soak();
	Wash thread2=new Wash();
	Dry thread3=new Dry();
	
	thread1.start();
	thread1.join(3000);
	thread2.start();
	thread2.join();
	thread3.start();
	
}
}
