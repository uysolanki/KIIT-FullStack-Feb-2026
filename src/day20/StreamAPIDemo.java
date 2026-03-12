package day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamAPIDemo {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		
		//store the square of the elements in another array and display them
		//imperative style of programming dictates how it is to be done
		//how it is to be done
//		List<Integer> arr1=new ArrayList();
//		
//		for(int n:arr)
//		{
//			int sqr=n*n;
//			arr1.add(sqr);
//		}
//		
//		for(int n:arr1)
//		{
//			System.out.println(n);
//		}
//		
		//stream API function 
		//what is to be done
		
		List<Integer> numbers=new ArrayList(Arrays.asList(1,2,3,4,5));
		
//		List<Integer> sqrNumbers=numbers.stream().map(num->num*num).toList();
//		System.out.println(sqrNumbers);
		
//		numbers.stream().map(num->num*num).forEach(num->System.out.println(num));
		
//		numbers.stream().map(num->num*num).forEach(StreamAPIDemo::displayInt);
		
//		numbers.stream().map(num->num*num).forEach(System.out::println);
		
		
		//display squares of all even numbers
		//1,2,3,4,5   ->   2,4
//		numbers.stream().filter(num->num%2==0).map(num->num*num).forEach(System.out::println);
		
//		List<Integer> sqrEvenNumbers=numbers.stream().filter(num->num%2==0).map(num->num*num).collect(Collectors.toList());  //before jdk 16
//		sqrEvenNumbers.stream().forEach(System.out::println);
//		System.out.println(sqrEvenNumbers);
		
//		Optional<Integer> result=numbers.stream().reduce((num,acc)->num+acc);
//		System.out.println(result.get());
		
		//Multiply all numbers by 10 and collect in List
		List<Integer> num2=numbers.stream().map(StreamAPIDemo::multiplyBy10).toList();
		System.out.println(num2);
		
		
		List<String> months=new ArrayList(Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December"));
		List<String> monthsUC=months.stream().map(month->month.toUpperCase()).toList();
		
		//display those months whose length>5 in lowercase
		
		List<String> monthsLengthGt5InLC=months.stream().filter(month->month.length()>5).map(month->month.toLowerCase()).toList();
		
		
		
	}
	
	public static void displayInt(int num)
	{
		System.out.println(num);
	}
	
	public static int multiplyBy10(int num)
	{
		return num*10;
	}

}
