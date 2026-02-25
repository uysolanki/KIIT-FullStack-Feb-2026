package day9;

public class SuperDriverApp {

	public static void main(String[] args) {
		Person p1;		//ref
		
		p1=new Person();
		
		//p1=new Employee();		//Upcasting P p = new C()  very widely used
		
		Employee e1=new Employee();
		e1.displayEmployee();
		
		Employee e2=new Employee(123L, "Bunty", 21,102, "Clerk", 1000.0);
		e2.displayEmployee();
	}

}
