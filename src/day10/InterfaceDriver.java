package day10;

public class InterfaceDriver {
public static void main(String[] args) {
	
	Animal a1;
	Horse h1;
	
	h1=new Horse();
	h1.eat();
	h1.sleep();
	h1.run();
	h1.racing();
	
	
	Tiger t1=new BengalTiger();
	Animal t2=new BengalTiger();
	BengalTiger t3=new BengalTiger();
	
}
}
