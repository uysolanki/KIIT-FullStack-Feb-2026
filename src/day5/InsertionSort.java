package day5;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[]= {20,30,60,10,40};
		System.out.println("Before" +Arrays.toString(arr));
		insertionSort(arr);
		System.out.println("After " +Arrays.toString(arr));

	}
	
	public static void insertionSort(int arr[])
	{
		for(int k=1;k<arr.length;k++)
		{
			int temp=arr[k];
			int j=k-1;
			while(j>=0 && temp<=arr[j])
			{
				arr[j+1]=arr[j];
				j--;
			}
			
			arr[j+1]=temp;
		}
	}

}
