import org.junit.*;

import java.util.ArrayList;

public class BasketTest {

    private static Basket basket;
    private static Books book1;
    private static Books book2;

    @BeforeClass
    public static void setup(){
        basket = new Basket();
        book1 = new Books("haha", 123);
        book2 = new Books("lala", 234);
        System.out.println("test has been setup");
    }

    @Before
    public void beforeTest(){

        System.out.println("before test");
    }

    @Test
    public void test_GetBooksInBasket_ReturnsEmptyBookList_IfNoBooksHaveBeenAdded(){
        ArrayList<Books> result = basket.getBooksInBasket();
        Assert.assertEquals(0,result.size());
    }

    @Test
    public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethod(){
        basket.addBook(book1);
        basket.addBook(book2);
        ArrayList<Books> result = basket.getBooksInBasket();
        Assert.assertEquals(2,result.size());
    }



    @After
    public void afterTest(){
        System.out.println("after test");
    }

    @AfterClass
    public static void cleanup(){
        System.out.println("after class");
    }




}