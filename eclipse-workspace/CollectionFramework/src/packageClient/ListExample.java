package packageClient;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import packageEntity.Book;

public class ListExample {

	public static void main(String[] args) {
		List<Book> books=new ArrayList<>();
		books.add(new Book(1,"name 1",300));
		books.add(new Book(3,"name 3",500));
		books.add(new Book(5,"name 5",1000));
		books.add(new Book(4,"name 4",450));
		books.add(new Book(2,"name 2",780));
		
		Collections.sort(books);
		Collections.sort(books, (b1,b2)->b1.getTitle().compareTo(b2.getTitle()));
		
		for (Book book : books) {
			System.out.println(book);
		}
	}

}
