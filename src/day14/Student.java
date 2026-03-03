package day14;

public class Student implements Cloneable
{
		
	private int rno;
	private String name;
	
	public Student() {}
	public Student(int rno, String name)
	{
		this.rno = rno;
		this.name = name;
	}
	
	@Override
	protected void finalize() throws Throwable 
	{
		System.out.println("Object Destroyed");
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
