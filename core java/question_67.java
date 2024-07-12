//Write a Java program to join two array lists//
package assignment;

import java.util.ArrayList;

public class question_67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println(list);
		ArrayList list1=new ArrayList();
		list1.add("red");
		list1.add("blue");
		list1.add("black");
		list1.add("white");
		
		System.out.println(list1);
		ArrayList a=new ArrayList();
		a.addAll(list);
		a.addAll(list1);
		
		System.out.println(a);
		
	}

}
