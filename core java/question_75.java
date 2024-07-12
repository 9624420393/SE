//Write a Java program to get a collection view of the values contained in this map.


package assignment;

import java.util.HashMap;
import java.util.Map;

public class question_75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map  map = new HashMap();
		map.put(1, "c");//entry
		map.put(2, "c++");
		map.put(3,"java");
		map.put(4, "php");
		map.put(5, "python");
		
		System.out.println(map);
		
		System.out.println("collections"+map.values());

	}

}
