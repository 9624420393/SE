//Write a Java program to get the number of elements in a hash set.//

package assignment;

import java.util.HashSet;
import java.util.Set;

public class question_60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s=new HashSet();
		s.add("red");
		s.add("orange");
		s.add("pink");
		s.add("black");
		s.add("white");
		
		System.out.println("hash set"+s);
		
		System.out.println("hash size:"+s.size());
		
	}

}
