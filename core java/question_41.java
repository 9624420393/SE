///W.A.J.P to create a custom exception if Customer withdraw amount which is greater
//than account balance then program will show custom exception otherwise amount
//will deduct from account balance. 

//Account balance is: 2000 
//Enter withdraw amount:2500
//Sorry, insufficient balance, you need more 500 Rs. To perform this transaction.

package assignment;

import javax.naming.InsufficientResourcesException;

class account{
      private int balance=2000;
      
      public int balance()
      {
    	  return balance;
      }

      public void withdraw(int amt)throws InsufficientResourcesException {
    	  if(amt >balance)
    	  {
    		  throw new InsufficientResourcesException(String.format("Sorry insufficient balance ,you need more 500 to perform this transaction:",+ balance,amt));
    	  }
    	  
    	  balance=balance-amt;
      }
}
public class question_41 {
        
	 public static void main(String[] args) throws InsufficientResourcesException {
		account ac=new account();
		System.out.println("account balance:"+ac.balance());
		System.out.println("withraw amount:2500");
		ac.withdraw(2500);
		System.out.println("current balance:"+ac.balance());
	}
     
}
