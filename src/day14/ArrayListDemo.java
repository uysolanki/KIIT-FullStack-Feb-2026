package day14;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();  //heterogenous
		int a=10;		//Primitive
		a1.add(a);		//int   or Integer
		a1.add(10.5);   //Double
		a1.add("Alice");//String
		a1.add(true);	//Boolean
		a1.add(new Student(18,"Virat"));
		
//		(a1.get(0))
		
//		a1.add(1, 20);
//		System.out.println(a1);
//		int num1=(int)a1.get(0);
//		((Integer)a1.get(0)).
//		String name=(String)a1.get(2);
//		System.out.println(name);
	
		
		ArrayList<String> names=new ArrayList<String>();  //heterogenous  generics  collection is used in homogenous way
		names.add("Alice");
		names.add("Ben");
		names.add("Chris");
		names.add("Tom");
		names.add("Frank");
		names.add("David");
		
		String name1=names.get(0);
		//names.remove("Alice");
		names.remove(0);
		System.out.println(names);
		System.out.println(names.size());
		
		System.out.println(names.isEmpty());
		//names.clear(); //[]  size=0
		System.out.println(names.isEmpty());
		System.out.println(names);
		System.out.println(names.contains("Tom"));
		
//		ArrayList<Student> kiit=new ArrayList<Student>();
//		kiit.add(new Student(18,"Virat"));
//		kiit.add(new Student(45,"Rohit"));
//		kiit.add(new Student(63,"Bramha"));
//		
//		
//		System.out.println(kiit.get(1).getName());
		
		ArrayList kiit=new ArrayList();
		kiit.add(new Student(18,"Virat"));
		kiit.add(new Student(45,"Rohit"));
		kiit.add(new Student(63,"Bramha"));
		
		
		System.out.println(((Student)kiit.get(1)).getName());
	}

}
