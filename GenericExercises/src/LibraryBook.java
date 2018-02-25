

public class LibraryBook <Integer, T extends Book>{
	
	private Integer ID;
	private T bookItem;
	
	public LibraryBook(Integer iD, T bookItem) {
		super();
		ID = iD;
		this.bookItem = bookItem;
	}

	@Override
	public String toString() {
		return "LibraryBook [ID=" + ID + ", bookItem=" + bookItem + "]";
	}
	
}
