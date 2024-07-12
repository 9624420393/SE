//Write a Java program to remove the third element from an array list.


package assignment;

import java.util.ArrayList;

public class question_53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add("green");
		list.add("black");
		list.add("white");
		list.add("purple");
		list.add("pink");
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
	}

}
