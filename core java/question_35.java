//Create a class named 'Shape' with a method to print "This is this is shape". Then
//create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both
//having a method to print "This is rectangular shape" and "This is circular shape"
//respectively. Create a subclass 'Square' of 'Rectangle' having a method to print
//"Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the
//object of 'Square' class.//
package assignment;

class shape1{
	public void shape1() {
		System.out.println("this is shape");
	}
}

class rectangle1 extends shape1{
	public void rectangle1() {
		System.out.println("this is rectangular shape");
	}
}

class circle extends shape1{
	public void circle() {
		System.out.println("this is circular shape");
	}
}

class square1 extends rectangle1{
	public void square1() {
		System.out.println("square is a rectangle");
	}
}

public class question_35 {

	public static void main(String[] args) {
		square1 s=new square1();
		s.shape1();
		s.rectangle1();

	}

}
