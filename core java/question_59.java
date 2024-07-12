//Write a Java program to iterate through all elements in a hash list.

package assignment;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class question_59 {

	public static void main(String[] args) {
		Set s=new HashSet();
		s.add("red");
		s.add("orange");
		s.add("pink");
		s.add("black");
		s.add("white");
		
		System.out.println(s);
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());

	}

}
}