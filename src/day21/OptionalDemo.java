package day21;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {

        Optional<String> name = OptionalDemo.getUserName(2);

       // System.out.println(name.orElse("User Not Found"));
       // System.out.println(name);
        if(name.isPresent())
        {
        	System.out.println("User found "+name.get());
        }

	}

	public static Optional<String> getUserName(int id) {

        if(id == 1)
            return Optional.of("Rahul");
        else
            return Optional.empty();
    }
}
