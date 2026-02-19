package day6;

public class LinearSearchDemo2 {

	public static void main(String[] args) {
		int arr[]= {10,50,40,20,30};
		int search=25;
		int index=linearSearch(arr,search);
		String result=index==-1?"Not Found":"Found at index "+index;
		System.out.println(result);
	}

	private static int linearSearch(int[] arr, int search) 
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search)
				return i;	
		}
		return -1;
	}

}
