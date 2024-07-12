//Write a Java program that accepts an integer (n) and computes the value of
//n+nn+nnn. Input number: 5

package assignment;

import java.util.Scanner;

public class question_11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		char s1,s2,s3;
		System.out.println("input number:");
		num=in.nextInt();
		
	   System.out.printf("%d+ %d%d +%d%d%d",num,num,num,num,num);
				
		
	}

}
