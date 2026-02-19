package day6;

public class LinearSearchDemo {

	public static void main(String[] args) {
		int arr[]= {10,50,40,20,30};
		int search=21;
		int flag=0;
		
		for(int n:arr)
		{
			if(n==search)
			{
				flag=1;
				break;
			}
		}
		
		if(flag==1)
			System.out.println("Found");
		else
			System.out.println("Not Found");

	}

}
