package packageClient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyExample {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);
		List<Double> dlist= Arrays.asList(1.4,5.0,6.2,7.7);
		List<Integer> listcopy=new ArrayList<>();
		List<Double> dlistcopy=new ArrayList<>();
		
		copy(listcopy,list);
		copy(dlistcopy,dlist);
		
		System.out.println(listcopy);
		System.out.println(dlistcopy);
	}

	
	private static <T> void copy(List<T> dest,List<T> source) {
		for (T t : source) {
			dest.add(t);
		}
	}
}
