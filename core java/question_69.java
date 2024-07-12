//Write a Java program to convert a hash set to a List/Array List.
package assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class question_69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		set.add("java");
		set.add('d');
		set.add(314535);
		set.add(1);
		set.add("java");
		set.add(false);
		System.out.println("hash set");
		System.out.println(set);
		
		ArrayList list=new ArrayList(set);
		System.out.println("array list");
		System.out.println(list);
		
		

	}

}
