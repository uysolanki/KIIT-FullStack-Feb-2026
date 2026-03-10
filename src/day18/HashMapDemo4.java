package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import day16.Student;

public class HashMapDemo4 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		
//		int oddCount=0;
//		int evenCount=0;
//		
//		for(int n:arr)
//			if(n%2==0)
//				evenCount++;
//			else
//				oddCount++;
//		
//		System.out.println("ODD COUNT "+oddCount);
//		System.out.println("EVEN COUNT "+evenCount);
		
		Map<String,Integer> hashmap=new HashMap<String, Integer>();
		hashmap.put("odd", 0);
		hashmap.put("even", 0);
		
		for(int n:arr)
		{
			if(n%2==0)
			{
				int oldValue=hashmap.get("even");
				int newValue=oldValue+1;
				hashmap.put("even", newValue);
			}
			else
			{
				int oldValue=hashmap.get("odd");
				int newValue=oldValue+1;
				hashmap.put("odd", newValue);
			}
		}
		
		System.out.println(hashmap);
	}

}
