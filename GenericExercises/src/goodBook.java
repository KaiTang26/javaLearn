
public class goodBook implements Book{
	private String name;
	
	private String author;

	

	public goodBook(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}



	@Override
	public String toString() {
		return "goodBook [name=" + name + ", author=" + author + "]";
	}
	
	

}
