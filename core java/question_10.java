//Write a Java program to print the ASCII value of a given character//

package assignment;

import java.util.Scanner;

public class question_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// input of character//
		System.out.println("enter any character:");
	     char ch=sc.next().charAt(0);
	     
		
		int ascii=ch;
		// output//
		System.out.println("ascii value:"+ascii);
		
		
		

	}

}
