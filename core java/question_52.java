///Write a Java program to update specific array element by given element.

package assignment;

import java.util.ArrayList;

public class question_52 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("green");
		list.add("black");
		list.add("white");
		list.add("purple");
		list.add("pink");
		System.out.println(list);
		
		list.set(1, "red");
		
		System.out.println(list);
		

	}

}
