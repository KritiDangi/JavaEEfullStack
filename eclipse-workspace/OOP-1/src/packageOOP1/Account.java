/**
 * 
 */
package packageOOP1;

/**
 * @author Administrator
 *
 */
public class Account {
	private String accNo;
	private double balance; //state variable
	//when using in methods, better to prefix with 'this'.
	
	private static int count;  //class member..counts no. of accounts created
	
	public Account(String accNo) {
		super();
		this.accNo = accNo;
		count++;
	}
	
	//overloading
	public Account() {
		super();
		count++;
	}

	/**
	 * This method is to credit amount into the account
	 * @param amt amount to be credited
	 * 
	 */
	public void deposit(double amt) {
		balance+=amt;
	}
	/**
	 * This method returns current account balance
	 * @return current balance
	 */
	public double getBalance() {
		return balance;
	}
	
	public String getAccNo() {
		return this.accNo;
	}
	
	@Override
	public boolean equals(Object obj) {
		Account other=(Account)obj;
		return (this.accNo == other.accNo);
	}
	
	//class call
	public static int getCount() {
		return count;
	}
}
