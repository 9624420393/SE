//W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by zero
//exception and another one is to handle ArrayIndexOutOfBoundException) int a [] =new int [5]; a [5]=30/0;

package assignment;

public class question_38 {

	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[5]=30/0;
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("zero cant be divided by number");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array range is out of size");
		}
	}

}
