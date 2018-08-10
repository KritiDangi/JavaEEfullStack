package packageUtility;

public class Utility {
	public static void sort(Comparable[] elems) {
		for (int i = 0; i < elems.length; i++) {
			for (int j = i+1; j < elems.length; j++) {
				if (elems[i].compareTo(elems[j])>0) {
					Comparable comparable = elems[j];
					elems[j]=elems[i];
					elems[i]=comparable;
				}
			}			
		}
	}
}
