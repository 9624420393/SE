///Create a class with a method that prints "This is a parent class" and its subclass with
//another method that prints "This is child class". Now, create an object for each of
//the class and call 1 - method of parent class by object of parent class 2 - method of
//child class by object of child class 3 - method of parent class by object of child class

package assignment;

class A{
	
	public void classA() {
		System.out.println("This is a parent class");
	}
}

class B extends A {
	public void classB()
	{
		System.out.println("This is a child class");
	}
	
}

public class question_24 {

	public static void main(String[] args) {
		
		A a=new A();
		//parent class is  by object of parent class//
		a.classA();
		
		B b=new B();
		//parent class by object of child class//
		b.classA();
		//child class by object of child class //
		b.classB();
		
		

	}

}
