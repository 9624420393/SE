//Write a Java program to increase the size of an array list.
package assignment;

import java.util.ArrayList;

public class question_71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add("red");
		list.add("pink");
		list.add("white");
		list.add("orange");
		
		System.out.println(list);
		list.ensureCapacity(6);
		list.add("black");
		list.add("blue");
		System.out.println(list);
	}

}
