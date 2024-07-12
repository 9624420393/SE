//Write a Java program to compare two array lists.

package assignment;

import java.util.ArrayList;
import java.util.List;

public class question_65 {
	public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<String>();
	list.add("red");
	list.add("pink");
	list.add("white");
	list.add("orange");
	
	
	System.out.println(list);
	ArrayList list1 = new ArrayList();
    list1.add("blue");
    list1.add("pink");
    list1.add("violet");
    list1.add("orange");
    
    System.out.println(list1);
    ArrayList<String>list2=new ArrayList<String>();
    for (String e : list)
        list2.add(list1.contains(e) ? "Yes" : "No");
     System.out.println(list2);
    
   
    
    

	
}
}