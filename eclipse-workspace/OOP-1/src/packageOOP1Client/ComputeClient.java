package packageOOP1Client;

import java.util.function.Function;
import java.util.function.BiFunction;
import packageUtility.Compute;

public class ComputeClient {
	public static void main(String[] args) {
		Compute<Integer,Double> c=(x,y)->{System.out.println(x+y);};
		c.add(4, 5.0);
		c.check();
		
		Function<Integer, String> f=(x)->{
			return "you said "+x;
		};
		System.out.println(f.apply(2));

		BiFunction<Integer,Integer,Double> bf= (x,y)-> {
			return ((double)x/(double)y);
		};
		System.out.println(bf.apply(1, 2));
		
	}
}
