//Write a Java program to check whether a map contains key-value mappings (empty) or not.

package assignment;

import java.util.HashMap;
import java.util.Map;

public class question_70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		map.put(1, "c");
		map.put(2, "c++");
		map.put("java", 3);
		map.put(1.4, "php");
		map.put(true, "python");
		map.put(null,"java");
		System.out.println(map);
		
		
		System.out.println("is the key '0' present?" + map.containsKey(0) );
		System.out.println("is the key 'java' present ?" +map.containsKey("java"));
		
	}

}
