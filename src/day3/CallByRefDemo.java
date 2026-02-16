package day3;

public class CallByRefDemo {

	public static void main(String[] args) {
		int arr[]= {10,20};									//0		1
		System.out.println(arr[0]);		//10				10	20
		demo(arr);						//call by ref
		System.out.println(arr[0]);	
	}

	private static void demo(int brr[]) 	//OG
	{
		System.out.println(brr[0]);
		brr[0]=99;
		System.out.println(brr[0]);
	}
}
