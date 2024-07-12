//W.A.J. P to implement the above program (pro.no-B27) using nesting of try-catch
//block. try {
//try
//{//code}
//catch (Exception e)
//{//code}
//catch (Exception e)
//{//code}

package assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class question_39{

	public static void main(String[] args) {
		try {
		   try {
			   Scanner sc = new Scanner(System.in);
				System.out.println("enter a = ");
				int a = sc.nextInt();
				System.out.println("enter b = ");
				int b = sc.nextInt();
				int c = a/b;
			System.out.println(c);
				System.exit(0);
			}
		   catch (ArithmeticException e)
		   {
				System.out.println("denominator should be greater than 0");
			}
			catch(InputMismatchException e) 
		   {
				System.out.println("denominator should be numeric value");
			}
			catch(Exception e)
		   {
				e.printStackTrace();
		
			}
		}
		   finally
		   {
				System.out.println("this block will execute everytime");
		    }
		}
	}
	
		

