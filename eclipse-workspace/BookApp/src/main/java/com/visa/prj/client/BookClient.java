package com.visa.prj.client;

import java.util.ArrayList;
import java.util.List;

import com.visa.prj.dao.BookDao;
import com.visa.prj.dao.BookDaoJDBC;
import com.visa.prj.dao.FetchException;
import com.visa.prj.dao.PersistenceException;
import com.visa.prj.entity.Book;

public class BookClient {

	public static void main(String[] args) {
		BookDao bookdao=new BookDaoJDBC();
		while(true) {
			printOptions();			
			int choice = KeyboardUtil.getInt("Select option");
			if(choice==1) {
				Book b=new Book();
				b.setTitle(KeyboardUtil.getString("Enter title"));
				b.setPrice(KeyboardUtil.getDouble("Enter price"));
				try {
					bookdao.addBook(b);
				} catch (PersistenceException e) {
					e.printStackTrace();
				}finally {
					b=null;
				}
			}else if(choice == 2) {
				List<Book> books=new ArrayList<>();
				try {
					books=bookdao.getBooks();
					for (Book book : books) {
						System.out.println(book);
					}
				} catch (FetchException e) {
					e.printStackTrace(); // => development stage
					//System.out.println(e.getMessage());  //    => production stage(more readable to client and hides the logic)
				}finally {
					books=null;
				}
			}else if(choice == 3) {
				System.out.println("Byeee");
				System.exit(0);
			}
		}
		
		
	}

	public static void printOptions() {
		System.out.println("1.Add book");
		System.out.println("2.List books");
		System.out.println("3.Exit");
		System.out.println("Select (1/2/3)");
	}
}
