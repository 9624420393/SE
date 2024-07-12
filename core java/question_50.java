//Write a Java program to insert an element into the array list at the first position//


package assignment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class question_50 {

	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		list.add("green");
		list.add("black");
		list.add("white");
		list.add("purple");
		list.add("pink");
		System.out.println(list);
        list.add(0,"orange");
        System.out.println(list);
	}

}
