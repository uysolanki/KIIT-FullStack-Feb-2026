package day13;

public class EHInConstructorDemo {

	public static void main(String[] args) {

		try
		{
		Student s1=new Student(18,"Virat");
		}
		catch(Exception e1)
		{
			System.out.println(e1.getMessage());
		}

	}

}
