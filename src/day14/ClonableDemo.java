package day14;

public class ClonableDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1=new Student(18,"Virat");
		
		Student s2=(Student)s1.clone();

		s1.setRno(45);
		System.out.println(s2.getRno());
		
		Amitabh a1=new Amitabh();
		Abhishek a2=new Abhishek();
		
		test(a1);
		test(a2);
		
	}
	
	
	public static void test(Amitabh obj)
	{
		
	}
	
	public static Amitabh test1()
	{
		Amitabh a1=new Amitabh();
		Abhishek a2=new Abhishek();
		//return a1;
		return a2;
	}

}
