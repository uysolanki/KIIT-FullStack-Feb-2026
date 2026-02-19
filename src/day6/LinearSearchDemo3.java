package day6;

public class LinearSearchDemo3 {

	public static void main(String[] args) {
		//
		//          0  1  2  3  4   5
		int arr[]= {10,50,40,20,30};
		int search=30;
		//int flag=0;
		int i;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==search)
			{
				System.out.println("Found at index "+ i);
				break;
			}
		}
		
		if(i==arr.length)
			System.out.println("Not Found");

	}

}
