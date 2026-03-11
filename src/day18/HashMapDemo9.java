package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import day16.Student;

public class HashMapDemo9 {

	public static void main(String[] args) {
		String sentance="enot listen bac silent lisent note tone abc bac cab";
		String str1="silent";
		String str2="listen";
		
		char arr1[]=str1.toCharArray();	//['s'  'i'  'l'  'e'  'n'  't']
		char arr2[]=str2.toCharArray();	//['l'  'i'  's'  't'  'e'  'n']
		
		Arrays.sort(arr1);  //['e'  'i'  'l'  'n'  's'  't']
		Arrays.sort(arr2);  //['e'  'i'  'l'  'n'  's'  't']
		
		String str11=new String(arr1);	//"eilnst"  <-- key
		String str22=new String(arr2);	//"eilnst"
		
		if(str11.equals(str22))
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");
	}

}
//[3,  [one, two]]


//3    [listen, silent]
//4    [note, tone, enot]
//5    [abc, bac, cab]