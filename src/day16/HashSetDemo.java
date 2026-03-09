package day16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo {
public static void main(String[] args)		//no order and no duplicates
{
	
	
	Set<String> names=new HashSet();
	names.add("Alice");
	names.add("Ben");
	names.add("Chris");
	names.add("David");
	names.add(null);
	
	System.out.println(names);
	
	List<String> names1=new ArrayList();
	names1.add("Alice");
	names1.add("Ben");
	names1.add("Chris");
	names1.add("David");
	names1.add(null);
	names1.add("Alice");
	names1.add("Alice");
	
	
	System.out.println(names1);
	
	Set<String> names2=new HashSet(names1);
	System.out.println(names2);
	
	
}
}
