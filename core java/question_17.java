//W.A.J.P to check whether a given string ends with the contents of another string. 
//"Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True

package assignment;

public class question_17 {

	public static void main(String[] args) {
		{
			// input of two strings//
			String s1 = "Java Exercises";
			String s2 = "Java Exercise";
	 
			String e = "se";
			// boolean function is used to get true and false value//  
			boolean n1 = s1.endsWith(e);
			boolean n2 = s2.endsWith(e);
			
			// output//
			System.out.println("'" + s1 + "' ends with " +"'" + e + "' ? " + n1);
			System.out.println("'" + s2 + "' ends with " + "'" + e + "' ? " + n2);
		}
	}

}
