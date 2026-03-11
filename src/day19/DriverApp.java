package day19;

public class DriverApp {

	public static void main(String[] args) {
		
		Sample s2=()->{System.out.println("Welcome Rohit Sharma to KIIT");};
		s2.greet();
		
		Sample s3=()->System.out.println("Welcome Hardik Pandya to KIIT");
		s3.greet();
		
		

	}

}
//function interface + lambda expression  (aka closures)

