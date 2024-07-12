//Write a program to print the factorial of a number by defining a method named

//'Factorial'. Factorial of any number n is represented by n! And is equal to 1*2*3*.
//*(n-1) *n. E.g.-
//4! = 1*2*3*4 = 24
//3! = 3*2*1 = 6
//2! = 2*1 = 2
//Also, 1! = 1
//0! = 0

package assignment;

import java.util.Scanner;

public class question_32 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int num,i=1;
		long fact=1;
		
		
		System.out.println("enter a num:");
		num = sc.nextInt();
		
		while(i<=num)
		{
			fact*=i;
			i++;
		}
		
		System.out.println("fact:"+fact);
	}

}
