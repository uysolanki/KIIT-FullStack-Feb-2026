package day15;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		List<Student> fyStudents=new ArrayList();
		
		fyStudents.add(new Student(18,"Virat",78.5));
		fyStudents.add(new Student(87,"Rohit",88.5));
		fyStudents.add(new Student(63,"Surya",98.5));
		
		System.out.println(fyStudents);
		System.out.println("----------------------");
		int max=0;
		Student maxStudent=null;
		for(Student student:fyStudents)
		{
			if(student.getRno()>max)
			{
				max=student.getRno();
				maxStudent=student;	
			}
		}
		
		System.out.println("Student with max J no is "+maxStudent.getName());
			
		
		

	}

}
