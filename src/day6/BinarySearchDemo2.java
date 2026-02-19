package day6;

public class BinarySearchDemo2 {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int search=50;
		
		int first=0;
		int last=arr.length-1;
		int index=binarySearch(arr,first,last,search);
		String result=index==-1?"Not Found":"Found at index "+index;
		System.out.println(result);
	}
	
	public static int binarySearch(int arr[],int first,int last,int search)
	{
		while(first<=last)
		{
			int mid=(first+last)/2;
			if(arr[mid]==search)
			{
				return mid;
			}
			else if(search>arr[mid])
			{
				first=mid+1;
			}
			else
			{
				last=mid-1;
			}
		}
		
		return -1;
	}

}
