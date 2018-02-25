
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pair<Integer, Integer> pair = new Pair<Integer, Integer>(1,2);
		
		System.out.println(pair.getFirst());
		
		LibraryBook<Integer, goodBook> book1 = new LibraryBook<Integer, goodBook>(1,new goodBook("Hello", "Kai"));
		
		System.out.println(book1);
		
		
	
		

	}

}
