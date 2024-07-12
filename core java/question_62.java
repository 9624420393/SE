///Write a Java program to count the number of key-value (size) mappings in a map.


package assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class question_62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		  hash_map.put(1, "Red");
		  hash_map.put(2, "Green");
		  hash_map.put(3, "Black");
		  hash_map.put(4, "White");
		  hash_map.put(5, "Blue");
		  System.out.println("Size of the hash map: "+hash_map.size());
		 }
		
			
}
	




