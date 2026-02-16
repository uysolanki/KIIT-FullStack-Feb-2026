package day3;

public class FunctionCallinDemo {

	public static void main(String[] args) {
		
		System.out.println("I am in main");						//1
		brazil();
		System.out.println("I am finally back in main");        //5
	}

	private static void brazil() {
		System.out.println("I am in Brazil");					//2
		argentina();
		System.out.println("I am back in Brazil");				//4
	}

	private static void argentina() {
		System.out.println("I am in Argentina");				//3
	}
}
