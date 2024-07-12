///Write a program to print the area and perimeter of a triangle having sides of 3, 4 and
//5 units by creating a class named 'Triangle' without any parameter in its constructor.

package assignment;

class triangle{
	
	int a,b,c;
	public double getarea() {
		
		 double X=(a+b+c)/2.0;
		return Math.pow((X*(X-a)*(X-b)*(X-c)),0.5);
	
	  }
	public double getperimeter() {
		return (a+b+c)/2;
	}
	  
	  
	}

public class question_27 {

	public static void main(String[] args) {
		triangle t=new triangle();
		t.a=3;
		t.b=4;
		t.c=5;
		System.out.println(t.getarea());
		System.out.println(t.getperimeter());

	}

}
