///Create a class to print an integer and a character with two methods having the same name but different sequence of the integer
// and the character parameters. 
//For example, if the parameters of the first method are of the form (int n, char c), then
//that of the second method will be of the form (char c, int n).

package assignment;

//method overloading is used to define same name with different parameters//
class sequence{
	public void print(int n,char c)
	{
		System.out.println("integer:"+n+","+"character:"+c);
	}
	public void print(char c,int n)
	{
		System.out.println("character:"+c+","+"integer:"+n);
	}
	
}

public class question_22 {

	public static void main(String[] args) {
		sequence obj= new sequence();
		
		obj.print(10, 'k');
		obj.print('V', 23);
		

	}

}
