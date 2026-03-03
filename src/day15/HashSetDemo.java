package day15;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> names=new HashSet();
		names.add("Alice");
		names.add("Ben");
		names.add("Chris");
		names.add("David");
		names.add(null);
		names.add("Chris");
		
		System.out.println(names);
		
		Set<Integer> setA=new HashSet(Arrays.asList(1,2,3));
		Set<Integer> setB=new HashSet(Arrays.asList(3,4,5));		//AnB
		
		setA.retainAll(setB);
		System.out.println(setA);
		
		
		

	}

}
