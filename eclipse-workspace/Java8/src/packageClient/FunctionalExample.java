package packageClient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Although not annotated but it is a func interface
interface Consumer<T> {
	void accept(T obj);
}

@FunctionalInterface
interface Predicate<T>{
	boolean test(T obj);
}


public class FunctionalExample {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);
		
		//long method
		iterable(list, new Consumer<Integer>() {

			@Override
			public void accept(Integer obj) {
				// TODO Auto-generated method stub
				System.out.println(obj);
			}
			
		});
		
		//using lambda exp
		iterable(list,(obj)->System.out.println(obj));
		//even simpler
		iterable(list,obj->System.out.println(obj));
		//even shorter
		iterable(list, System.out::println);
		
		List<Integer> filtered=filter(list, obj -> obj%2==0);
		System.out.println(filtered);
	}
	
	//Generic function - OCP
	// ? - allows only getters, no mutations
	// ? extends T - allows only getters, no mutations
	private static <T> void iterable(List<T> list,Consumer<T> cons) {
		//list.add(3);      NOT allowed.compilation error(mutation)
		
		for (T integer : list) {
			cons.accept(integer);
		}		
	}
	
	private static <T> List<T> filter(List<T> list, Predicate<T> pred){
		List<T> copy= new ArrayList<>();
		for (T t : list) {
			if(pred.test(t))
				copy.add(t);
		}
		
		return copy;
	}
}
