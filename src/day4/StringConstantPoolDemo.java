package day4;

public class StringConstantPoolDemo {

	public static void main(String[] args) {
		String name="Alice";
		
		String name1="Alice";
		
		String name2="Ben";
		
		String name3=new String("Alice");
		
		String name4=new String("Alice");
		
		String name5=new String("alice");
		
		System.out.println(name==name1);  //true
		
		System.out.println(name==name3);  //false
		
		System.out.println(name3==name4);  //false
		
		System.out.println(name3.equals(name4)); //true
		
		System.out.println(name3.equals(name5)); //false
		
		System.out.println(name3.equalsIgnoreCase(name5)); //true

	}

}
