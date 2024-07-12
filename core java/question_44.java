//W.A.J. P to create one thread by extending Thread class in another Class.//

package assignment;

class tthread extends question_44{
	public  void run() {
		System.out.println("thread ");

	}
}
public class question_44 {

	public static void main(String[] args) {
		tthread th=new tthread();
		
		System.out.println("hiii");
		
	}

}
