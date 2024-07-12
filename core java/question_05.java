//Write a program in Java to input 5 numbers from keyboard and find their sum and average using for loop.
package assignment;

import java.util.Scanner;

public class question_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0,avg;
		
		// input//
		System.out.println("enter any five numbers:");
		
		// loop to get addition of five numbers//
		for(int i=0;i<=5;i++)
		{
			i=sc.nextInt();	
			sum+=i;
		}
		 
		System.out.println("summation:"+sum);
		
		// average of five number//
		
		avg=sum/5;
		
		System.out.println("average of numbers:"+avg);
		

 }
}