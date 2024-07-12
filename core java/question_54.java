//Write a Java program to search an element in an array list.


package assignment;

import java.util.ArrayList;

public class question_54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add("green");
		list.add("black");
		list.add("white");
		list.add("purple");
		list.add("pink");
		
		if(list.contains("white"))
		{
			System.out.println("data found");
		}
		else
		{
			System.out.println("data not found");
		}
	}

}
