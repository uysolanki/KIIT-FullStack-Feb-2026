package day8;

public class SingleInheritanceDemo {

	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		e1.acceptPerson();
		e1.acceptEmployee();
		e1.displayPerson();
		e1.displayEmployee();
		
		int a=10; //local visibilty/life is within that {} in which it is declared
		
		if(true)
		{
			int b=20;			//block level scope aka local scope
		}
	}

}
