package day10;

public class ObjectRefDriver {

	public static void main(String[] args) {
		Amitabh a1;
		Abhishek a2;
		
		
		a1=new Abhishek();
		
		a1.home();	//home is method -> method belong to the object->object is of Abhishek->hence Abhisheks home
		System.out.println("My Qualification is "+a1.qualification);
					//qual is data -> data belong to the ref->ref is of Amitabh->hence Amitabhs qual

		System.out.println(a1.getClass().getName());
	}

}


//data belongs to the ref      - static method
//method belongs to the object - non static method