package day4;

import java.util.Arrays;

public class String1 {

	public static void main(String[] args) {
		String name1="Chetan";
		String name2=new String("Chetan");
		char name3[]= {'C','h','e','t','a','n'};
		String name4=new String(name3);
		
		int arr[]= {1,2,3};
		System.out.println(name3); //['C','h','e','t','e','n']
		System.out.println(Arrays.toString(arr)); //[1,2,3]
		String s1=name1+" "+name2+" "+arr;
		System.out.println(s1);

	}

}
