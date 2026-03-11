package day19;

public class DriverApp7 {

	public static void main(String[] args) {
		
		
		Sample7 s1=num->{
			int fact=1;
			for(int i=1;i<=num;i++)
			{
				fact=fact*i;
			}
			return fact;
		};

		int ans=s1.factorial(5);
		System.out.println(ans);
	}

}


