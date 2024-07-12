//Take two numbers from the user and perform the division operation and handle
//Arithmetic Exception. O/P- Enter two numbers: 10 0

package assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

class div{
	public void division()throws ArithmeticException,InputMismatchException{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
		int res = a/b;
		if(b<0) {
			throw new ArithmeticException("");
		}
		else {
			int c = a/b;
			System.out.println(c);
		}
		System.exit(0);
}

}
public class question_37 {

	public static void main(String[] args) {
		try {
			
			div d=new div();
			d.division();
		} 
		catch (ArithmeticException e)
		{
			System.out.println("denominator should be greater than zero");
		}
	}

}
