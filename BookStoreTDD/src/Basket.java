import java.util.ArrayList;

public class Basket {

    private ArrayList<Books> books = new ArrayList<>();




    public ArrayList<Books> getBooksInBasket() {

        return books;
    }

    public void addBook(Books book1) {
        books.add(book1);
    }
}
