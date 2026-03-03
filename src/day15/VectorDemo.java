package day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
//		System.out.println();		//synchronized  at a time only 1 thread can update it
//		Vector<Integer> vector1=new Vector();	//No Args Constructor
//												//default capacity =10
//												//default increment = double
//		vector1.add(1);
//		System.out.println("SIZE "+vector1.size());			//1		
//		System.out.println("CAPACITY "+vector1.capacity()+"\n");	//10
//		
//		for(int i=2;i<=10;i++)
//			vector1.add(i);
//		
//		System.out.println("SIZE "+vector1.size());			//10		
//		System.out.println("CAPACITY "+vector1.capacity()+"\n");	//10		size==capacity
//
//		vector1.add(11); 
//		System.out.println("SIZE "+vector1.size());		   	//11    size>capacity		capacity doubles
//		System.out.println("CAPACITY "+vector1.capacity()+"\n");//20
//		

//		Vector<Integer> vector2=new Vector(5);	//parameterised Constructor
//												//custom capacity =5
//												//default increment = double
//		
//		System.out.println("SIZE "+vector2.size());		   		//0    size>capacity		capacity doubles
//		System.out.println("CAPACITY "+vector2.capacity()+"\n");//5
//		for(int i=1;i<=6;i++)
//			vector2.add(i);
//		
//		System.out.println("SIZE "+vector2.size());		   		//6    size>capacity		capacity doubles
//		System.out.println("CAPACITY "+vector2.capacity()+"\n");//20

//		Vector<Integer> vector3 = new Vector(5,3); // parameterised Constructor
//													// custom capacity =5
//													// custome increment =3
//
//		System.out.println("SIZE " + vector3.size()); // 0 size>capacity capacity doubles
//		System.out.println("CAPACITY " + vector3.capacity() + "\n");// 5
//		for (int i = 1; i <= 6; i++)
//			vector3.add(i);
//
//		System.out.println("SIZE " + vector3.size()); // 6 size>capacity capacity doubles
//		System.out.println("CAPACITY " + vector3.capacity() + "\n");// 20
		
		List<Integer> a1=new ArrayList(Arrays.asList(10,20,30,40,50));
		
		Vector<Integer> vector4 = new Vector(a1);
		
		
	}

}
