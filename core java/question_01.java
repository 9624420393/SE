///Write a Java program to Take three numbers from the user and print the greatest number.///

package assignment;
import java.util.Scanner;
public class question_01 {

	public static void main(String[] args) {
		
		// input of three integer number//
		
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a :");
	    a = sc.nextInt();
	    System.out.println("Enter the value of b :");
	    b = sc.nextInt();
	    System.out.println("Enter the value of c :");
	    c = sc.nextInt();
	    
	    // condition is established to find the greatest number among three number//
	    
	    if(a>b && a>c) {
	    	System.out.println("A is greater");	    
	    }
	    else if(b>a && b>c) {
	    	System.out.println("B is greater");
	    }
	    else {
	    	System.out.println("C is greater");
	    }
	    
        
	}

}
