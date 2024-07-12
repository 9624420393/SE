//Write a Java program to associate the specified value with the specified key in a Hash Map.

package assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class question_61 {

	public static void main(String[] args, HashMap hash_map) {
		HashMap<Integer,String> hash_map1= new HashMap<Integer,String>();  
		  hash_map1.put(1, "Red");
		  hash_map1.put(2, "Green");
		  hash_map1.put(3, "Black");
		  hash_map1.put(4, "White");
		  hash_map1.put(5, "Blue");
		  Set set = hash_map.entrySet();
			Iterator itr = set.iterator();
			while(itr.hasNext()) {
				Map.Entry entry = (Entry)itr.next();
				System.out.println(entry.getKey());
				System.out.println(entry.getValue());
		

	}
	}

}