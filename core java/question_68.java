//Write a Java program to convert a hash set to an array.

package assignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class question_68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		set.add("java");
		set.add('d');
		set.add(314535);
		set.add(1);
		set.add("java");
		set.add(false);
		System.out.println(set);
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
