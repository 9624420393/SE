//W.A.J.P to create a class Student with attributes roll no, name, age and course.
//Initialize values through parameterized constructor. If age of student is not in
//between 15 and 21 then generate user defined exception
//"AgeNotWithinRangeException". If name contains numbers or special symbols
//raise exception "NameNotValidException". Define the two exception classes.

package assignment;
import java.io.*;
class AgeNotWithInRangeException extends Exception
     {
      public String toString()
         {
            return("Age is not between 15 and 21 Please ReEnter the Age");
         }
     }
class NameNotValidException extends Exception
    {
       public String validname()
        {
          return("Name is not Valid  Please ReEnter the Name");
        }
    } 
class student{
	int rollno;
	String name;
	int age;
	String course;
	student(){
		
	}
	
	student(int r,String n,int a,String c)
	{
		rollno=r;
		name=n;
	    age=a;
		course=c;
		int temp=0;
		int I = n.length();
		for(int i=0;i<I;i++)
		{
			char ch;
			ch=n.charAt(i);
			if(ch<'A' || ch>'Z' && ch<'a' || ch>'z')
			temp=1;
			}
			/*———-Checking Name——————–*/
			try
			{
			if(temp==1)
			throw new NameNotValidException();
			else
			name=n;
			}
			catch(NameNotValidException e2)
			{
			System.out.println(e2);
			}
			/*———-Checking Age——————–*/
			try
			{
			if(a>=15 && a<=21)
			
			age=a;
			
			else 

			throw new AgeNotWithInRangeException();
			
			}
			catch(AgeNotWithInRangeException e1)
			{
			System.out.println(e1);
			}
			}
			void display()
			{
			System.out.println("roll Name Age Course");
			System.out.println("————————————————-");
			System.out.println(rollno+" " +name+" "+age+" "+course);
			
			}
		}
	
public class question_42 {

	public static void main(String[] args)throws IOException {
		
		student s=new student(16, "Vrund8", 50, "JAVA");
		s.display();
	}

}
