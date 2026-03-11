package day19;

public class DriverApp3 {

	public static void main(String[] args) {
		
		Sample3 s2=(nm)->{System.out.println("Welcome "+nm+" to KIIT");};
		s2.greet("Rohit Sharma 1");
		
		Sample3 s3=(nm)->{System.out.println("Welcome "+nm+" to KIIT");};
		s3.greet("Virat Kohli 1");
		
		//single parameter we can skip the ()
		//if the lambda exp body is of single statement we can skip the {} ->return keyword is embedded, no need to provide explicitly
		//if the lambda exp body is of multiline statement then we have to give both {} and return keyword explicilty
		
		Sample3 s4=nm->System.out.println("Welcome "+nm+" to KIIT");
		s2.greet("Rohit Sharma 1");
		
		

	}

}
//function interface + lambda expression  (aka closures)

