package day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {

	public static void main(String[] args) {
		List<Student> fyStudents = new ArrayList();

		fyStudents.add(new Student(18, "Virat", 78.5));
		fyStudents.add(new Student(87, "Rohit", 88.6));
		fyStudents.add(new Student(63, "Suryakumar", 76.5));
		
		
//		Iterator<Student> fy= fyStudents.iterator();
//		while(fy.hasNext())
//			System.out.println(fy.next().getName());
//		
		
//		ListIterator<Student> fy1= fyStudents.listIterator();
//		while(fy1.hasNext())
//			System.out.println(fy1.next().getName());
//		
//		System.out.println("--------------");
//		
//		while(fy1.hasPrevious())
//			System.out.println(fy1.previous().getName());
		
//		ListIterator<Student> fy1= fyStudents.listIterator();
//		while(fy1.hasNext())
//		{
//			if(fy1.next().getName().length()>5)
//				fy1.set(new Student(1,"Apple",50.0));			//replace
//		}
//		
//		System.out.println(fyStudents);
		
		
	//	ListIterator<Student> fy1= fyStudents.listIterator();
		ListIterator<Student> fy1= fyStudents.listIterator();
		while(fy1.hasNext())
		{
			if(fy1.next().getName().length()==5)
				fy1.remove();
		}
		
		System.out.println(fyStudents);

	}

}
