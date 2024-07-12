//Write a Java program to shuffle elements in an array list.//

package assignment;

import java.util.ArrayList;
import java.util.Collections;

public class question_57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add("green");
		list.add("black");
		list.add("white");
		list.add("purple");
		list.add("pink");
		System.out.println(list);
	
		Collections.shuffle(list);
		System.out.println("after shuffle");
		System.out.println("list"+list);

	}

}
