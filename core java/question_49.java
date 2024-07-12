//Write a Java program to iterate through all elements in an array list.//

package assignment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class question_49 {

	public static void main(String[] args) {

		ArrayList list=new ArrayList();
		list.add("green");
		list.add("black");
		list.add("white");
		list.add("purple");
		list.add("pink");
		System.out.println(list);

		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
