//Write a Java program to extract a portion of an array list//

package assignment;

import java.util.ArrayList;
import java.util.List;

public class question_64 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("red");
		list.add("black");
		list.add("white");
		list.add("orange");
		list.add("pink");
		
		System.out.println(list);
		List sub_list = list.subList(0, 3);
		System.out.println(sub_list);
		
		
		
	}

}

