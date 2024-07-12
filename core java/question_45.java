///W.A.J.P to create 2 threads and execute that threads by providing sleep time as 2000ms and check the execution.

package assignment;

class NewThread extends Thread{
	public void run() {
		
		Thread t = new Thread();
		System.out.println(t);
		t.setName("MyThread");
		System.out.println(t);
		for(int i=1;i<=5;i++) {
			System.out.println(i+":"+t);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("thread complete");
	}
}
public class question_45 {

		public static void main(String[] args) throws InterruptedException {
			Thread t = new Thread();
			System.out.println(t);
			t.setName("MyThread");
			System.out.println(t);
			for(int i=1;i<=5;i++) {
				System.out.println(i+" : "+t);
				Thread.sleep(2000);
			}
			System.out.println("thread complete");
			
		}
	}





