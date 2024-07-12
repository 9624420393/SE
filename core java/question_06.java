//Write a program in Java to display the pattern like right angle triangle with a number.
//1
//12
//123
//1234
//12345

package assignment;
import java.util.Scanner;
public class question_06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i,j;
		
		// outer loop//
		for(i=1;i<=5;i++)
		{
			// inner loop//
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
		
		
		System.out.println("");
		}

	}

}
