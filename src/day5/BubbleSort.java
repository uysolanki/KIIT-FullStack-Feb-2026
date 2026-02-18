package day5;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {20,30,60,10,40,50};
		System.out.println("Before" +Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("After " +Arrays.toString(arr));

	}
	
	public static void bubbleSort(int arr[])
	{
		int temp;
		for(int i=1;i<=arr.length;i++)
		{
		   for(int j=0;j<arr.length-i;j++)
		   {

		       if(arr[j] > arr[j+1])
		       {
		         temp=arr[j];
		         arr[j]=arr[j+1];
		         arr[j+1]=temp;
		       }
		   }
		}
	}

}
