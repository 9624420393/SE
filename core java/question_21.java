 //Create a class named 'Print Number' to print various numbers of different data types by creating different methods
//with the same name 'printn' having a parameter for each data type.

/// method overloading concept is used to perform this program in which same name is used with different parameters//

package assignment;

  class printnumber{
	  /// method overloading function is used to print using various data types//
	public void printn(int num)
	{
		System.out.println("integer:"+num);
	}
	
	  public void printn(float num)
	  {
		  System.out.println("float:"+num);
	  }
	  
	  public void printn(Double num)
	  {
		  System.out.println("double:"+num);
	  }
	  
	  public void printn(long num)
	  {
		  System.out.println("long:"+num);
	  }
	  public void printn(boolean num)
	  {
		  System.out.println("double:"+num);
	  }
	  
	  public void printn(String str)
	  {
		  System.out.println("String:"+str);
	  }
	  
}

public class question_21 {
	public static void main(String[] args) {
		// object is created//
		printnumber obj=new printnumber();
		// output of all the data types//
		obj.printn(1);
		obj.printn(0.1f);
		obj.printn(1.2345);
		obj.printn(100000000L);
		obj.printn(false);
		obj.printn("vrunda patel");
		
		
	}	

}
