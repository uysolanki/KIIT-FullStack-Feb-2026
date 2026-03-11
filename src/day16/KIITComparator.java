package day16;

import java.util.Comparator;

public class KIITComparator 
{

	public static Comparator<Student> c1=(s1,s2)->{
		if(s1.getRno()>s2.getRno())
			return 1;
		else if(s1.getRno()<s2.getRno())
			return -1;
		else return 0;
	};
	
	public Comparator<Student> c2=(s1,s2)->{
		if(s1.getRno()>s2.getRno())
			return 1;
		else if(s1.getRno()<s2.getRno())
			return -1;
		else return 0;
	};
	
	public Comparator<Student> c3=(s1,s2)->{
		if(s1.getRno()>s2.getRno())
			return 1;
		else if(s1.getRno()<s2.getRno())
			return -1;
		else return 0;
	};
}
