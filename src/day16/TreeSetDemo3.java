package day16;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo3 {
public static void main(String[] args)		//maintain natural sorting order and no duplicates
{
	Comparator<Student> c1=(s1,s2)->{
		if(s1.getRno()>s2.getRno())
			return 1;
		else if(s1.getRno()<s2.getRno())
			return -1;
		else return 0;
	};

	//Set<Student> fyStudentsAttendance=new TreeSet(new RnoComparator());
	//Set<Student> fyStudentsAttendance=new TreeSet(c1);
	Set<Student> fyStudentsAttendance=new TreeSet(KIITComparator.c1);
	
	fyStudentsAttendance.add(new Student(18,"Virat",78.5));
	fyStudentsAttendance.add(new Student(87,"Rohit",88.5));
	fyStudentsAttendance.add(new Student(16,"Rishab",65.5));
	fyStudentsAttendance.add(new Student(63,"Surya",98.5));	
	System.out.println("Attendance");
	System.out.println(fyStudentsAttendance);
	
	
	Set<Student> fyStudentsMarkList=new TreeSet(new PerComparator());
	
	fyStudentsMarkList.add(new Student(18,"Virat",78.5));
	fyStudentsMarkList.add(new Student(87,"Rohit",88.5));
	fyStudentsMarkList.add(new Student(16,"Rishab",65.5));
	fyStudentsMarkList.add(new Student(63,"Surya",98.5));	
	System.out.println("Marklist");
	System.out.println(fyStudentsMarkList);
	
	Set<Student> fyStudentsExamSeating=new TreeSet(new NameComparator());
	
	fyStudentsExamSeating.add(new Student(18,"Virat",78.5));
	fyStudentsExamSeating.add(new Student(87,"Rohit",88.5));
	fyStudentsExamSeating.add(new Student(16,"Rishab",65.5));
	fyStudentsExamSeating.add(new Student(63,"Surya",98.5));	
	System.out.println("Exam Seating");
	System.out.println(fyStudentsExamSeating);
}
}
