//Write a Java program to compare two sets and retain elements which are same on both sets.

package assignment;

import java.util.HashSet;

public class question_74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashSet set=new HashSet();
        set.add("red");
        set.add("blue");
        set.add("black");
        set.add("white");
        
        System.out.println(set);
        
        HashSet set1=new HashSet();
        set1.add("red");
        set1.add("orange");
        set1.add("black");
        set1.add("white");
        
        set.retainAll(set1);
        
        System.out.println(set);
	}

}
