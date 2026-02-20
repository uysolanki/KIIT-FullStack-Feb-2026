package day6;

public class BinarySearchDemo3 {

	public static void main(String[] args) {
		int arr[]= {70,80,90,10,20,30};
		int mid=arr.length/2;				mid=3;
		int search=22;
		int index=0;
		
		if(search>=arr[0])
		{
			index=binarySearch(arr,0,mid-1,search);
		}
		else
		{
			index=binarySearch(arr,mid,arr.length-1,search);
		}
		
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
