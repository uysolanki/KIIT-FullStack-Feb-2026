package day15;

import java.util.Arrays;
import java.util.List;

public class AsListDemo {

	public static void main(String[] args) {
		String[] arr = {"A", "B", "C"};

		List<String> list = Arrays.asList(arr);

		System.out.println(list);
		//list.add("D");
		//System.out.println(list);
		
		List<String> list1 = Arrays.asList("A","B","C");
		System.out.println(list1);
		list1.add("D");
		System.out.println(list1);

	}

}
