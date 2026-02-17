package day4;

public class StringFormatDemo {

	public static void main(String[] args) {
		int age=21;
		String name="Alice";
		double height=5.8;
		
		
		//System.out.println("My name is "+name + " I am " + age + " years old" + "I am " + height + " feets tall");
		//System.out.println(String.format("My name is %s I am %d years oldI am %.2f feets tall", name,age,height));
		System.out.printf("My name is %s I am %d years oldI am %.2f feets tall", name,age,height);
		
		
		System.out.println(String.format("%-10s %d", "Tie",500));
		System.out.println(String.format("%-10s %d", "Belt",700));
		System.out.println(String.format("%-10s %d", "Trouser",1500));
		System.out.println(String.format("%-10s %d", "Total",2700));
		
	}

}
