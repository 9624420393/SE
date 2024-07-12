///Write a Java program to sort a given array list.


package assignment;

import java.util.ArrayList;
import java.util.Collections;

public class question_55 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("green");
		list.add("black");
		list.add("white");
		list.add("purple");
		list.add("pink");
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
	}

}
