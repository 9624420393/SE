///Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area and perimeter of the rectangle respectively.
//Its constructor having parameters for length and breadth is used to initialize the length and breadth of the rectangle.
//Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for its side (suppose s) calling the constructor of its parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square.

package assignment;

class rectangle{
	int length;
	int breadth;
	
	public rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	
	// area of rectangle//
	public void area()
	{
		System.out.println(length*breadth);
	}
	
	// perimeter of rectangle//
	public void perimeter()
	{
		System.out.println(2 * (length + breadth));
	}
	
}

class square extends rectangle{
	/// area of square//
	 public square(int side) {
		 super(side,side);
	 }
}

public class question_26 {

	public static void main(String[] args) {
		rectangle r=new rectangle(5,5);
		rectangle square=new square(2);
		System.out.println("area and perimeter of rectangle");
		r.area();
		r.perimeter();
		System.out.println("area and perimeter of square");
        square.area();
        square.perimeter();
	}

}
