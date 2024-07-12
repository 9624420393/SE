//W.A.J.P to start the same Thread twice by calling start () method twice. Test
//ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start ()


package assignment;
public class TestThreadTwice  extends Thread{  
	 public void run(){  
	   System.out.println("running...");  
	 }  
	 public static void main(String args[]){  
	  TestThreadTwice t1=new TestThreadTwice();  
	  t1.start();  
	  t1.start();  
	 }  
	}  

