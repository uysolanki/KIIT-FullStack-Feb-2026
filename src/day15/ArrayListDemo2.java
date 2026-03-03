package day15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		List<Integer> a1=new ArrayList();	//default capacity of ArrayList = 10;
		
		a1.add(10);  //0
		a1.add(20);	 //1						//size =2
		
		System.out.println(a1.get(2));	
		System.out.println(a1.size());
		
		for(int i=3;i<=10;i++)
			a1.add(i);	//2 --> 3					//size =10    size == capacity
			
		System.out.println(a1.size());
		
		System.out.println(a1.get(2));	  			//3
		
		
		a1.add(99);									//size =11    size > capacity
													//Collections autogrow
													//new capacity = [(3/2  * old capacity) + 1]
													//new capacity =16
		
		
		

	}

}
