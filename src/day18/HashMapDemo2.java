package day18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import day16.Student;

public class HashMapDemo2 {

	public static void main(String[] args) {
		//name  salary
		Map<String,Student> m100=new HashMap();
		m100.put("first",new Student(18,"Virat",78.5));
		m100.put("second",new Student(87,"Rohit",88.5));
		m100.put("third",new Student(16,"Rishab",65.5));
		
		Map<String,Student> m200=new HashMap();
		m200.put("first",new Student(63,"Surya",78.5));
		m200.put("second",new Student(93,"Jasprit",88.5));
		m200.put("third",new Student(33,"Hardik",65.5));
		
		List<Map<String,Student>> olympic=new ArrayList();
		olympic.add(m100);
		olympic.add(m200);
		
		
		//display name of student who came first in 100m race
		
//		System.out.println(m100.get("first").getName());
//		
//		//using olympic display name of student who came first in 100m race
//		System.out.println(olympic.get(0).get("first").getName());
		
		//using olympic display name of student who came first in both race
		for(Map<String,Student> race:olympic)
			System.out.println(race.get("first").getName());

	}

}
