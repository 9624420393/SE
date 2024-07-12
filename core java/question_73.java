//Write a Java program to print all the elements of an Array List using the position of the elements.
package assignment;

import java.util.ArrayList;

public class question_73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add("red");
		list.add("green");
		list.add(1);
		list.add(8);
		list.add("java");
		
		System.out.println(list);
		
		int num=list.size();
		for(int i=0;i<=num;i++)
		{
			System.out.println(list.get(i));
		}
	}

}
