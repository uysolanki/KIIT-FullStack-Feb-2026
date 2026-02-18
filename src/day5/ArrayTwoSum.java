package day5;

public class ArrayTwoSum {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int sum=900;
		int flag=0;
		for(int i=0;i<arr.length;i++)				//i			arr[i]		num1		num2
		{											//0			10			10			80
			int num1=arr[i];
			int num2=sum-num1;
			for(int j=i;j<arr.length;j++)
			{
				if(arr[j]==num2)
				{
					System.out.println("["+num1+","+num2+"]");
					flag=1;
					break;
				}
			}
			
		}
		if(flag==0)
			System.out.println("No Pair Found");

	}

}
