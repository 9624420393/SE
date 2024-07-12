//We have to calculate the percentage of marks obtained in three subjects (each out of

//100) by student A and in four subjects (each out of 100) by student B. Create an
//abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two
//other classes 'A' and 'B' each having a method with the same name which returns the
//percentage of the students. The constructor of student A takes the marks in three
//subjects as its parameters and the marks in four subjects as its parameters for student
//B. Create an object for each of the two classes and print the percentage of marks for both the students.

package assignment;

abstract class marks{
	
}
// marks of three subjects//
class p1 extends marks{
	private float sub1,sub2,sub3;
	
	public p1(float s1,float s2,float s3)
	{
		sub1=s1;
		sub2=s2;
		sub3=s3;
	}
	
	// percentage of three subjects//
	double getpercentage() 
	{
		return (sub1+sub2+sub3)/300.00*100.00;
	}
}
// class for four sub marks//
class p2 extends marks{
	private float sub1,sub2,sub3,sub4;
	
	public p2(float s1,float s2,float s3,float s4)
	{
		sub1=s1;
		sub2=s2;
		sub3=s3;
		sub4=s4;
	}
	// per of four subjects//
	double getpercentage()
	{
		return (sub1+sub2+sub3+sub4)/400.00*100.00;
	}
}


public class question_31 {

	public static void main(String[] args) {
		p1 a=new p1(50,60,70);
		p2 b=new p2(30,40,90,50);
		double per1=a.getpercentage();
		double per2=b.getpercentage();
		
		// output ///
		System.out.println("percentage of student A:"+per1);
		System.out.println("percentage of student B:"+per2);
		
	}

}
