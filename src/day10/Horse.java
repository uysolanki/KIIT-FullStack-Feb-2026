package day10;

public class Horse implements Animal {
	@Override
	public void eat() {
		System.out.println("Horse Eating..");
	}

	@Override
	public void sleep() {
		System.out.println("Horse Sleeping..");
	}

	@Override
	public void run() {
		System.out.println("Horse Running..");
	}
	
	public void racing() {
		System.out.println("Horse Racing..");
	}
}
