//Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5
//and by both.

package assignment;

public class question_13 {

	public static void main(String[] args) {
		
		System.out.println("divisible by 3:");
		// loop to get the numbers which are divisible by 3//
		for(int i=0;i<100;i++)
		{
			/// number is divide by 3// 
			if(i%3==0)
			System.out.print(i+",");
		}
		System.out.println("\ndivisible by 5:");
		// loop to get the numbers which are divisible by 5//
		for(int i=0;i<100;i++)
		{
			if(i%5==0)
			{
				// number is divided by 5//
				System.out.print(i+",");
			}
		}
		
		// loop to get number divisible by both///
		System.out.println("\ndivisible by both:");
		for(int i=0;i<100;i++)
		{
			if(i%3==0 && i%5==0)
				System.out.print(i+",");
		}
		System.out.println("\n");
	}

}
