/**
 * 
 */
package packageTime;

/**
 * @author Administrator
 *
 */
public class Time {
	private int hrs,min;

	public Time(int hrs, int min) {
		super();
		this.hrs = hrs;
		this.min = min;
	}

	public static Time add(Time t1,Time t2) {
		Time t3 = new Time(0,0);
		t3.min=(t1.min+t2.min)%60;
		t3.hrs=t1.hrs+t2.hrs+(t1.min+t2.min)/60;
		return t3;
	}
	
	public Time add(Time t2) {
		Time t3 = new Time(0,0);
		t3.min=(this.min+t2.min)%60;
		t3.hrs=this.hrs+t2.hrs+(this.min+t2.min)/60;
		return t3;
	}
	
	public int getHours() {
		return this.hrs;
	}
	
	public int getMin() {
		return this.min;
	}
	
}
