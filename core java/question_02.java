//Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant,
// depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, 
//print an error message.//


package assignment;
import java.util.Scanner;
public class question_02 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Input any alphabet");
		
		String input=in.next().toLowerCase();
		
		// upper case ASCII Value starts from 65 to 90 //
		boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
		
		// lower case ASCII value start from 97 to 122//
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        boolean vowel = input.equals("a") || input.equals("e") || input.equals("i")
                || input.equals("o") || input.equals("u");
		
        // input of single character from the alphabet otherwise there will be an error in output//
        
		if(input.length()>1)
		{
			System.out.println("error!,enter only one alphabet");
		}
		else if(!(uppercase || lowercase))
		{
			
			System.out.println("error!,only upper case or lower case letter");
		}
		else if(vowel)
		{
			System.out.println("entered letter is vowel:");
		}
		else
		{
			System.out.println("entered letter is consonant");
		}
	}	
		
}
