package day19;

public class NonStaticMethodRef {

	public int myFactorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	void test()
	{
		NonStaticMethodRef obj=new NonStaticMethodRef();
		Sample7 s1= obj::myFactorial;
		int ans=s1.factorial(6);
		System.out.println(ans);
	}
	
	void test(NonStaticMethodRef obj)
	{
		Sample7 s1= obj::myFactorial;
		int ans=s1.factorial(6);
		System.out.println(ans);
	}
}
