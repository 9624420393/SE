///Create an abstract class 'Parent' with a method 'message'. It has two subclasses each

//having a method with the same name 'message' that prints "This is first subclass"
//and "This is second subclass" respectively. Call the methods 'message' by creating
//an object for each subclass.


package assignment;
abstract class parent{
	void message() {
	
    }
}
class subclass1 extends parent{
	void message() {
		System.out.println("this is first subclass");
	}
}

class subclass2 extends parent{
	void message() {
		System.out.println("this is second subclass");
	}
}

public class question_29 {

	public static void main(String[] args) {
		subclass1 s1=new subclass1();
		subclass2 s2=new subclass2();
		s1.message();
		s2.message();
		
	}

}
