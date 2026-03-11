package day19;

public class DriverApp6 {

	public static void main(String[] args) {
		
		
		Sample6 s=radius->Math.PI*radius*radius;
		double ans=s.areaCircle(5);
		System.out.println("Area of Circle is "+ans);
		
		Sample6 s1=radius->{return Math.PI*radius*radius;};
		double ans1=s1.areaCircle(6);
		System.out.println("Area of Circle is "+ans1);

	}

}
//function interface + lambda expression  (aka closures)

