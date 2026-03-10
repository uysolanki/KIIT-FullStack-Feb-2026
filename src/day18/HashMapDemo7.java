package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import day16.Student;

public class HashMapDemo7 {

	public static void main(String[] args) {
		String sentance="my name is Alice I am pursuing engg engg is a good stream ";
		Map<String,Integer> hashmap=new HashMap<String, Integer>();
		
		String[] words=sentance.split(" ");
		for(String word:words)
			hashmap.put(word, hashmap.getOrDefault(word, 0)+1);
		
		System.out.println(hashmap);
		
	}

}
