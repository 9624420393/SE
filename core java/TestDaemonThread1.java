///W.A.J.P to create 2 threads and make one thread as Daemon Thread by using set
//Daemon () method of Thread class and check whether the thread is set daemon or
//not by using is Daemon () method.
//TestDaemonThread2 t1=new TestDaemonThread2();
//TestDaemonThread2 t2=new TestDaemonThread2(); t1.start();
//t1.setDaemon(true);//will throw exception here t2.start();


package assignment;
public class TestDaemonThread1 extends Thread{  
	 public void run(){  
	  if(Thread.currentThread().isDaemon()){
		  
	   System.out.println("daemon thread work");  
	  }  
	  else{  
	  System.out.println("user thread work");  
	 }  
	 }  
	 public static void main(String[] args){  
		 
	  TestDaemonThread1 t1=new TestDaemonThread1();
	  TestDaemonThread1 t2=new TestDaemonThread1();  
	  TestDaemonThread1 t3=new TestDaemonThread1();  
	  
	  t1.setDaemon(true);
	    
	  t1.start();
	  t2.start();  
	  t3.start();  
	 }  
	}  

