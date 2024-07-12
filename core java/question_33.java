///We have to calculate the area of a rectangle, a square and a circle. Create an abstract

//class 'Shape' with three abstract methods namely 'RectangleArea' taking two
//parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The
//parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its
//side and that of 'CircleArea' is its radius. Now create another class 'Area' containing
//all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the
//area of rectangle, square and circle respectively. Create an object of class 'Area' and
//call all the three methods.

package assignment;
import java.util.Scanner;

import javax.crypto.Cipher;

import static java.lang.Math.*;
 abstract class shape{
	public abstract double rectanglearea(double length,double width);
	public abstract double squarearea(double side);
	public abstract double circlearea(double radius);
}

 class A1 extends shape{
	 Scanner in = new Scanner(System.in);
	@Override
	public double rectanglearea(double length, double width) {
		
		System.out.println("enter the length of rectangle:");
		double length1=in.nextDouble();
		System.out.println("enter the width of rectangle:");
		double width1=in.nextDouble();
		return length*width;
	}

	@Override
	public double squarearea(double side) {
		System.out.println("enter the side of square:");
		double s=in.nextDouble();
		return side*side;
	}

	@Override
	public double circlearea(double radius) {
		System.out.println("enter the radius of circle:");
		double r=in.nextDouble();
		return 3.14*r*r;
	}

	
	

 }
public class question_33 {

	public static void main(String[] args) {
		A1 area=new A1();

		double width =0;
		double length=0;
		System.out.println("rect :"+area.rectanglearea(length,width));

		double side=0;
		System.out.println("square:"+area.squarearea(side));
		

		double r=0;
		System.out.println("circle"+area.circlearea(r));
	}

}
