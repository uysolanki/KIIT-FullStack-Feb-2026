package day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection2D {

	public static void main(String[] args) {
		List<String> mh = new ArrayList(Arrays.asList("Pune", "Mumbai", "Nagpur"));
		List<String> rj = new ArrayList(Arrays.asList("Jaipur", "Bikaner", "Jodhpur"));
		List<String> or = new ArrayList(Arrays.asList("Rourkela", "Kalinga", "Bhuvaneshvar"));
		
		//mh.add("Lonavla");
		List<String> India = new ArrayList();
		India.addAll(mh);
		India.addAll(rj);
		India.addAll(or);
		System.out.println(India.get(4));
		System.out.println(India.get(1));
		

	}
	
	public static List getList()
	{
		ArrayList<String> a1=new ArrayList();
		a1.add("Pune");
		a1.add("Mumbai");
		a1.add("Nagpur");
		
		return a1;
	}

}
