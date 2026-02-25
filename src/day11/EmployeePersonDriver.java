package day11;

public class EmployeePersonDriver {

	public static void main(String[] args) {
		Employee e1=new Employee();
		//e1.displayEmployee();
		
		Employee e2=new Employee(123L, "Kiit", 23,777, "Manager", 1500.0);
		e2.displayEmployee();

	}

}
/*
Adhar Number is 333
Name is Chris
Age is 41
Employee Number is 777
Employee Designation is Manager
Employee Salary is 1500.0
*/


/*
Adhar Number is 123
Name is Kiit
Age is 23
Employee Number is 777
Employee Designation is Manager
Employee Salary is 1500.0
*/