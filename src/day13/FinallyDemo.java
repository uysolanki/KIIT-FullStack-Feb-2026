package day13;

public class FinallyDemo {

	public static void main(String[] args) {

			int result=divide(10,0);
			System.out.println(result);
	}

	private static int divide(int i, int j) {
		try
		{
			System.out.println(i/j);
			return 1;
		}
		catch(ArithmeticException e1)
		{
			return 2;
		}
		finally
		{
			return 3;
		}
	}

}
