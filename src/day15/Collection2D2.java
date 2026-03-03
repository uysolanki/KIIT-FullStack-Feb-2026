package day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Collection2D2 {

	public static void main(String[] args) {
		List<String> mh = new ArrayList(Arrays.asList("Pune", "Mumbai", "Nagpur"));
		List<String> rj = new ArrayList(Arrays.asList("Jaipur", "Bikaner", "Jodhpur"));
		List<String> or = new ArrayList(Arrays.asList("Rourkela", "Kalinga", "Bhuvaneshvar"));
		
		
		List<List<String>> India = new ArrayList();
		India.add(mh);
		India.add(rj);
		India.add(or);
		
		System.out.println(India.get(2).get(1));
		
		
		
		List<Student> fyStudents=new ArrayList();
		
		fyStudents.add(new Student(18,"Virat",78.5));
		fyStudents.add(new Student(87,"Rohit",88.6));
		fyStudents.add(new Student(63,"Surya",76.5));
		
		List<Student> syStudents=new ArrayList();
		
		syStudents.add(new Student(14,"Abhishek",78.5));
		syStudents.add(new Student(93,"Jasprit",98.6));
		syStudents.add(new Student(33,"Hardik",69.5));
		
		List<List<Student>> kiit=new ArrayList();
		kiit.add(fyStudents);
		kiit.add(syStudents);
		
		//display Name of Virat using kiit
		System.out.println(kiit.get(0).get(0).getName());
		
		//display All the Names of fy
		
//		for(int i=0;i<kiit.get(0).size();i++)
//			System.out.println(kiit.get(0).get(i).getName());
		
		for(Student student:kiit.get(1))
		{
			System.out.println(student.getName());
		}
			
		
		Iterator<Student> fy= fyStudents.iterator();
		while(fy.hasNext())
			System.out.println(fy.next());
		
	}
}
