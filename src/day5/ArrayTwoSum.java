package day5;

public class ArrayTwoSum {

	public static void main(String[] args) {
		//int arr1[]= {70,30,60,40,50,60};
		int arr[]= {1,1,1,1,1,1};
		int sum=2;
		int flag=0;
		int iterationCount=0;
		for(int i=0;i<arr.length;i++)				//i			arr[i]		num1		num2
		{											//0			10			10			80
			
			int num1=arr[i];
			int num2=sum-num1;
			for(int j=i;j<arr.length;j++)
			{
				iterationCount++;
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

		//System.out.println(iterationCount);
	}
}

// T(n) = 0(n * n+1)
//              ---
//               2