//Create a class to print the area of a square and a rectangle. The class has two methods
//with the same name but different number of parameters. The method for printing
//area of a rectangle has two parameters which are length and breadth respectively
//while the other method for printing area of square has one parameter which is side of square.


package assignment;

class calculate{
	     /// area to find area of square///
	
	   public void area(int a)
	   {
		   int A=a*a;
		   System.out.println("Area of square:"+A);
	   }
	   
	   /// area to find area of rectangle////
	   public void area(int length,int breadth)
	   {
		   int AREA=length*breadth;
		   System.out.println("Area of rectangle:"+AREA);
	   }
}

public class question_23 {

	public static void main(String[] args) {
		//creating object of area class//
		calculate obj=new calculate();
		obj.area(5);
		obj.area(1,2);
		

	}

}
