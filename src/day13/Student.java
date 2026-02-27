package day13;

public class Student {
		
	private int rno;
	private String name;
	
	public Student() {}
	public Student(int rno, String name) throws Exception
	{
		if(name==null)
			throw new Exception("Invalid name");
		this.rno = rno;
		this.name = name;
	}
	
	
	
	
	
}
