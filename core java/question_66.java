//Write a Java program of swap two elements in an array list.

package assignment;

import java.util.ArrayList;
import java.util.Collections;

public class question_66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("red");
		list.add("black");
		list.add("white");
		list.add("orange");
		list.add("pink");
		
		System.out.println("before swapping");
		System.out.println(list);
		Collections.swap(list, 1, 2);
		System.out.println("after swapping");
		System.out.println(list);
	}

}
