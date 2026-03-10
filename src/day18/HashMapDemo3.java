package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import day16.Student;

public class HashMapDemo3 {

	public static void main(String[] args) {
		//name  salary
		Map<Integer,List<String>> words=new HashMap();
		words.put(3,new ArrayList(Arrays.asList("one","two","six")));
		words.put(4,new ArrayList(Arrays.asList("four","five","lock")));
		words.put(5,new ArrayList(Arrays.asList("apple","mango","array")));
		
		
		

	}

}
