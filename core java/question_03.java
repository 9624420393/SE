//Write a Java program that takes a year from user and print whether that year is a leap year or not.//

package assignment;
import java.util.Scanner;
public class question_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// input the year//
		int year;
		System.out.println("enter the year:");
		year = sc.nextInt();
		
		// condition is check whether the input year is leap year or not//
		
		if(year % 4==0)
		{
			System.out.println("entered year is a leap year");
		}
		else 
		{
		    System.out.println("year is not a leap year");
	    }
	}
}
