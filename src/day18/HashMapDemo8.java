package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import day16.Student;

public class HashMapDemo8 {

	public static void main(String[] args) {
		String sentance="one two three four five six seven eight nine ten ";
		Map<Integer,List<String>> hashmap=new HashMap<Integer,List<String>>();
		
		String[] words=sentance.split(" ");
		for(String word:words)			//word = two
		{
			int key=word.length();		//key = 3
			hashmap.putIfAbsent(key,new ArrayList<String>());
			
			hashmap.get(key).add(word);			
		}
		
		System.out.println(hashmap.values());	
	}

}
//[3,  [one, two]]


//3   [one, two, six, ten]
//4    [four, five, nine]
//5    [three, seven,eight]