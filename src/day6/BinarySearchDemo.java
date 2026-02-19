package day6;

public class BinarySearchDemo {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int search=35;
		
		int first=0;
		int last=arr.length;
		
		while(first<=last)
		{
			int mid=(first+last)/2;
			if(arr[mid]==search)
			{
				System.out.println("Found at index "+mid);
				break;
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
		
		if(first>last)
			System.out.println("Not Found");

	}

}
