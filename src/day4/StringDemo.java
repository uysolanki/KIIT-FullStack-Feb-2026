package day4;

public class StringDemo {

	public static void main(String[] args) {
		
		String name1="Alice";  //String literal
					
		String name2=new String("Alice"); //String object
		
		char arr[]= {'A','l','i','c','e'};
		
		String name3=new String(arr);
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);

	}

}
