package packageClient;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayClient {
	public static void main(String[] args) {
		String names[]= {"bbb","aaaa","d","cc"};
		
		//NATURAL SORT
		Arrays.sort(names);
		for (String string : names) {
			System.out.println(string);
		}
		
		//USING COMPARATOR
		Arrays.sort(names, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();
			}
		});
		
		for (String string : names) {
			System.out.println(string);
		}
		
		//COMPARATOR USING LAMBDA EXP
		
		/*
		Comparator<String> c=(o1,o2)->{
			return o1.length()-o2.length();
			
		};
		Arrays.sort(names,c);
		*/
		
		Arrays.sort(names,(o1,o2)-> o1.length()-o2.length()	);
		//(o1,o2)-> o1.length()-o2.length()    No curly braces means result is automatically returned.
		
		for (String string : names) {
			System.out.println(string);
		}
	}
}
