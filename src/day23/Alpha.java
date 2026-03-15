package day23;

public class Alpha extends Thread
{
@Override
public void run() {
	for(int i=1; i<=1000;i++)
	{
		System.out.println(i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

//@Override						//overridden the start() -YES, is it recommeded
//	public synchronized void start() {
//		run();
//		System.out.println("my start");
//		
//	}

//public void run(int n) {		//can we overload the run() - YES , is it recommeded
//	for(int i=1; i<=n;i++)
//		System.out.println(i);
//}

}
