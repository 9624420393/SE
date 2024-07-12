//W.A.J.P to create the validate method that takes integer value as a parameter. If the age is less than 18,
//then throw an Arithmetic Exception otherwise print a message welcome to vote.

//O/P- Enter your age: 16

//Exception in thread main java. Lang. Arithmetic Exception: not valid

package assignment;

public class question_40 {
	static  void vote(int age) {
	       if(age<18)
	       {
	    	   throw new ArithmeticException("Not eligible to vote");
	       }
	       
	       else
	       {
	    	 System.out.println("welcome to vote");  
	       }
	       
	}

	       public static void main(String[] args) {
		
	        vote(16);
	        System.out.println("");
	   
	}

	
}
