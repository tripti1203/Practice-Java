import java.io.*;
import java.util.*;
public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("Getting Started with C","Sumita Arora");
		Book b2 = new Book("Getting Started With Python", " Sumita Arora");
		Book b3 = new Book("Getting Started With Java", " Sumita Arora");
	
		List<Book> books = new ArrayList<Book>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		Library library = new Library(books);
		List<Book> bks = library.getTotalBooks();
		for(Book bk : bks) {
			System.out.println("Tittle : " + bk.getTitle() + "\nAuthor : " + bk.getAuthor());
		}
	}

}
