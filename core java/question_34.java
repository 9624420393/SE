//Write a program which will ask the user to enter his/her
//marks (out of 100). Define a method that will display grades according to the marks
//entered as below:
//Marks Grade
//1-100 A
//1-90 B
//1-80 B
//1-70 C
//1-60 D
//41-50 DD


package assignment;

import java.util.Scanner;

public class question_34 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("enter the marks:");
		int marks=in.nextInt();
		
		String answer=grade(marks);
		
		System.out.println(answer);
	}
		static String grade(int marks) 
		{
	        if (marks>91 && marks<100)
	        {
	           return "A" ;
	        }
	    if (marks>81 && marks<90)
	    {
	        return "B";
	    }
	    if (marks>71 && marks<80)
	    {
	        return "B";
	    }
	        if (marks>61 && marks<70)
	        {
	            return "C";
	        }
	    if (marks>51 && marks<60)
	    {
	        return "D ";
	    }
	        if (marks>41 && marks<50)
	        {
	            return "DD ";
	        }
	    if (marks<=40)
	    {
	        return "FAIL";
	    }
	     else   return "Invalid data ";
	
		}
	
}
		
		
		

