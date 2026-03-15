package day23;

public class Numeric implements Runnable
{

	@Override
	public void run() {
		for(int i=2000;i<=3000;i++)
		{
			System.out.println("\t "+ i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
