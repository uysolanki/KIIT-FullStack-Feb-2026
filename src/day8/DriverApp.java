package day8;

public class DriverApp {
public static void main(String[] args) {
	//reference = object
	Student s1 =   new Student();
	Student s2 =   new Student();
	Student s3 =   new Student();
	
	s1.displayPerson();
	s2.displayPerson();
	s3.displayPerson();
	
//	s1.acceptPerson();
//	s1.displayPerson();
	
	Student s4 =   new Student(45,"Rohit",98.5);
	Student s5 =   new Student(93,"Bumrah",68.5);
	Student s6 =   new Student(18,"Virat",78.5);
	s4.displayPerson();
	s5.displayPerson();
	s6.displayPerson();
	
	//Student s7 =   new Student(18,"Virat",78.5);
	Student s7 =   new Student(s6);		//copy constructo
	s7.displayPerson();
	
	System.out.println(s6.getRno());
}
}
