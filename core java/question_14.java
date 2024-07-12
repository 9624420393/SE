//W.A.J.P to get the character at the given index within the String. Original String =
//Tops Technologies! The character at position 0 is T, The character at position 10 is o

package assignment;

public class question_14 {

	public static void main(String[] args) {
		String name="Tops Technologies";
		
		System.out.println("original string="+name);
		
		// char index at 0 position//
		int index1=name.charAt(0);
		// char index at 10 position//
		int index2=name.charAt(10);
		
		// output of the given string//
		
		System.out.println("ch at position 0:"+(char)index1);
		System.out.println("ch at position 10:"+(char)index2);
	}

}