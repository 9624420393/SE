//W.A.J. P to demonstrate try catch block,//

package assignment;
import java.util.InputMismatchException;
import java.util.Scanner;

class divide{
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

public class question_36 {

	public static void main(String[] args) {
		try {
			
			divide d=new divide();
			d.division();
		} 
		catch (ArithmeticException e)
		{
			System.out.println("denominator should be greater than 0");
		}
		catch (InputMismatchException e)
		{
			System.out.println("denominator should be numeric value");
		}
		catch (Exception e)
		{
		   e.printStackTrace();	
		}
		
	}

}
