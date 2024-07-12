//Write a program in Java to make such a pattern like right angle triangle with number
//increased by 1 The pattern like:
//1
//2 3
//4 5 6
//7 8 9 10


package assignment;

import java.util.Scanner;

public class question_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,k=1;
		
		//outer loop//
		for( i=1;i<=4;i++)
		{
			// inner loop//
			for(j=1;j<=i;j++)
			{
				   // k is incremented to get numbers//
		           System.out.print(k++);
		           
			}
			
			System.out.println("");
		}
		
		
		
	}
}
