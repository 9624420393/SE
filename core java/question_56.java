///Write a Java program to copy one array list into another.


package assignment;

import java.util.ArrayList;
import java.util.Collections;

public class question_56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add("green");
		list.add("black");
		list.add("white");
		list.add("purple");
		list.add("pink");
		System.out.println(list);
		
		ArrayList list1=new ArrayList();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");
		list1.add("5");
		System.out.println(list1);
		Collections.copy(list,list1);
		
		System.out.println("after copy:");
		System.out.println("list:"+list);
		System.out.println("list1:"+list1);
	}

}
