//W.A.J.P to check whether a given string starts with the contents of another string.
//Red is favorite color. Starts with Red? True Orange is also my favorite color. Starts
//with Red? False .


package assignment;

public class question_18 {

	public static void main(String[] args) {
		// input of two strings//
		String name="Red is favorite color";
		String name1="Orange is my favorite color";
		
		// boolean function to check the given string//
		String check="Red";
		boolean n1=name.startsWith(check);
		boolean n2=name1.startsWith(check);
		
		// output//
		System.out.println("'"+ name+"' starts with"+"'"+"Red"+"'?"+ n1);
		System.out.println("'"+ name1+"' starts with"+"'"+"Red"+"'?"+ n2);
		
	}

}
