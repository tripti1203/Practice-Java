import java.util.*;
public class Library {
	private final List<Book> books;
	Library(List<Book> books){
		this.books = books;
	}
	public List<Book> getTotalBooks() {
		return books;
	}
}
