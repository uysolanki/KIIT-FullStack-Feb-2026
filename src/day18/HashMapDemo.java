package day18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		//name  salary
		
		Map<String,Double> employees=new HashMap();
		employees.put("Alice", 800.0);
		employees.put("Ben", 900.0);
		employees.put("Ben", 1000.0);
		employees.put("Chris", 1100.0);
		employees.put(null, 1500.0);
		employees.put("George",null);
		employees.put("Frank", null);
		employees.put("David", null);
		
		System.out.println(employees);
		
		Set<String> keys=employees.keySet();
		System.out.println(keys);
		
//		ArrayList<Double> values=(ArrayList<Double>) employees.values();
//		System.out.println(values);
		
		System.out.println(employees.get("Alice"));

	}

}
