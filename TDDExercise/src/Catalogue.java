import java.awt.print.Book;
import java.util.ArrayList;

public class Catalogue {
	
	private ArrayList<Book> bookList;
	private ReaditermCommand read;

	
	
	public Catalogue() {
		super();
		// TODO Auto-generated constructor stub
		bookList = new ArrayList<Book>();
	}



	public Catalogue(ReaditermCommand mockread) {
		// TODO Auto-generated constructor stub
		read = mockread;
	}



	public ArrayList<Book> getAllBooks() {
		// TODO Auto-generated method stub
		
		read.readAll();
		return bookList;
	}

}
