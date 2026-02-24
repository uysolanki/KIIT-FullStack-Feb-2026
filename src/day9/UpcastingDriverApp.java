package day9;

public class UpcastingDriverApp {

	public static void main(String[] args) {
		Amitabh a1;
		Abhishek a2;
		Aradhya a3;
		
		a1=new Aradhya();
		a2=new Aradhya();
		a3=new Aradhya();
		
		a1.home();		//Jalsa
		
		
		a2.home();		//Jalsa
		a2.car();		//Audi
		
		a3.home();		//Jalsa
		a3.car();		//Audi
		a3.office();	//Bandra Office
	}

}
