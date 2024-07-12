///Print the sum, difference and product of two complex numbers by creating a class

//named 'Complex' with separate methods for each operation whose real and imaginary parts are entered by user.


package assignment;

class complex{
	
	int real;
	int imaginary;
	
	complex(int tempreal,int tempimaginary) {
		real=tempreal;
		imaginary=tempimaginary;
		
	}
	complex(){
		
	}
	// addition of two complex numbers//
	complex addcomp(complex a,complex b) {
		complex temp=new complex();
		temp.real=a.real+b.real;
		
		temp.imaginary=a.imaginary+b.imaginary;
		
		return temp;
		
	}
	// subtraction of two complex number///
	complex subcomp(complex a,complex b) {
		complex temp=new complex();
		temp.real=a.real-b.real;
		
		temp.imaginary=a.imaginary-b.imaginary;
		
		return temp;
		
	}
	
	
	void printcomplex() {
		System.out.println("complex num:"+real+"+ "+imaginary+"i");
	}
}

public class question_28 {

	public static void main(String[] args) {
		
		complex c1=new complex(5,4);
		c1.printcomplex();
		
		complex c2=new complex(10,5);
		
		c2.printcomplex();
		
		complex c3=new complex();
		c3=c3.addcomp(c1, c2);
		System.out.print("addition:");
		c3.printcomplex();
		c3=c3.subcomp(c1, c2);
		System.out.print("subtraction:");
		c3.printcomplex();
	}

}
