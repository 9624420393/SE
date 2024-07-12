//Write a Java program to count the letters, spaces, numbers and other characters of an input string.

package assignment;

public class question_09 {

	public static void main(String[] args)
	{
		// input string//
		String test="vrunda @ 23";
		count(test);

	}
	
	  public static void count(String x)
	  {
		char [] c=x.toCharArray();
		int Letter=0,Space=0,Digit=0;
		
		// loop to find the output from the provided string///
		for(int i=0;i<x.length();i++)
		{
		
			if(Character.isLetter(c[i]))
			{
				Letter++;
			}
			else if(Character.isDigit(c[i]))
			{
				Digit++;
			}
			else if(Character.isSpaceChar(c[i]))
			{
				Space++;
			}
			else 
			{
				System.out.println("invalid input");
			}
		}
		
		// output of the string//
		System.out.println("string:"+x);
		System.out.println("letter:"+Letter);/// letter count//
		System.out.println("digit:"+Digit);// didgit count//
		System.out.println("space:"+Space);// space count//
	}
	
    
}
