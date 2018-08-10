/**
 * 
 */
package packageOOP1Client;
import packageOOP1.Account;
/**
 * @author Administrator
 *
 */
public class AccountClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Account rahulAcc=new Account();
		Account shwetaAcc=new Account("506613");
		rahulAcc.deposit(4500.00);
		shwetaAcc.deposit(6700.00);
		/*
		System.out.println(rahulAcc.getBalance());
		System.out.println(shwetaAcc.getBalance());
		System.out.println(rahulAcc.getAccNo());
		System.out.println(shwetaAcc.getAccNo());
		*/
		Account smithaAcc = new Account("506613");
		smithaAcc.deposit(6780.00);
		
		Account other = smithaAcc;  //other is only a pointer to smithaAcc..so no new obj is created.
		
		/*
		if( other == smithaAcc) {
			System.out.println("Both are same [other == smithaAcc]");
		}

		if( shwetaAcc == smithaAcc) {
			System.out.println("Both are same [shwetaAcc == smithaAcc]");
		}
		*/
		if(shwetaAcc.equals(smithaAcc)) {
			System.out.println("both are similar [swethaAcc.equals(smithaAcc) = "+shwetaAcc.equals(smithaAcc)+"]");
		}
		
		System.out.println(Account.getCount());
	}
}
