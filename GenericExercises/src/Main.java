
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pair<Integer, Integer> pair = new Pair<Integer, Integer>(1,2);
		
		System.out.println(pair.getFirst());
		
		LibraryBook<Integer, Book> book1 = new LibraryBook<Integer, Book>(1,new Book("Hello", "Kai"));
		
		System.out.println(book1);
		
	
		

	}

}
