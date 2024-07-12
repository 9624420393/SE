//Write a Java program to reverse elements in an array list.


package assignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class question_63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("red");
		list.add("black");
		list.add("white");
		list.add("orange");
		list.add("pink");
		
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
		

	}

}
