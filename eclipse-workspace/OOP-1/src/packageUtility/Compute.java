package packageUtility;

@FunctionalInterface    //EXACTLY one method HAS TO BE implemented in class.
public interface Compute<T,G> {
	void add(T x,G y);
	
	default void check() {   //default allows us to implement methods in interfaces.
		System.out.println("I am default method");
	}
}
