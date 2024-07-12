///Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 

//$200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC'
//are subclasses of class 'Bank', each having a method named 'getBalance'. Call this
//method by creating an object of each of the three classes.



package assignment;

abstract class bank{
	void getbalance() {
		
	}
}

class BankA extends bank{
	void getbalance() {
		System.out.println("$100 is deposited");
	}
}

class BankB extends bank{
	void getbalance() {
		System.out.println("$150 is deposited");
	}
}

class BankC extends bank{
	void getbalance() {
		System.out.println("$200 is deposited");
	}
}

public class question_30 {

	public static void main(String[] args) {
		BankA a=new BankA();
		BankB b=new BankB();
		BankC c=new BankC();
		a.getbalance();
		b.getbalance();
		c.getbalance();
		
		

	}

}
