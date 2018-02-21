import org.junit.*;

public class CheckoutTest {

    private static Basket basket;
    private static Books book1;
    private static Books book2;
    private static Books book3;
    private static Books book4;
    private static Books book5;
    private static Books book6;
    private static Books book7;
    private static Books book8;
    private static Books book9;
    private static Books book10;
    private static Books book11;
    private static Books book12;

    private static Checkout check;


    @BeforeClass
    public static void setup(){
        basket = new Basket();
        book1 = new Books("good", 25.99);
        book2 = new Books("good2", 25.99);
        book3 = new Books("good3", 25.99);
        book4 = new Books("good", 25.99);
        book5 = new Books("good2", 25.99);
        book6 = new Books("good3", 25.99);
        book7 = new Books("good", 25.99);
        book8 = new Books("good2", 25.99);
        book9 = new Books("good3", 25.99);
        check = new Checkout();
        System.out.println("test has been setup");
    }

    @Before
    public void beforeTest(){

        System.out.println("before test");
    }

//    @Test
//    public void test_CalculatePrice_ReturnsDoubleZeroPointZeroWhenPassAnEmptyBasket(){
//        double result = check.calculatePrice(basket);
//        Assert.assertEquals(0.0, result, 0.0);
//
//    }
//
//    @Test
//    public void test_CalculatePrice_ReturnsPrice(){
//        basket.addBook(book1);
//        double result = check.calculatePrice(basket);
//        Assert.assertEquals(12.0, result, 0.0);
//
//    }

    @Test
    public void test_CalculatePrice_ReturnsPrice_forTwoBooks(){
        basket.addBook(book1);
        basket.addBook(book2);
        basket.addBook(book3);
        basket.addBook(book4);
        basket.addBook(book5);
        basket.addBook(book6);
        basket.addBook(book7);

        double result = check.calculatePrice(basket);
//        System.out.println(result);
        Assert.assertEquals(178.29, result, 0.02);
    }

//    @Test
//    public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethod(){
//
//    }



    @After
    public void afterTest(){
        System.out.println("after test");
    }

    @AfterClass
    public static void cleanup(){
        System.out.println("after class");
    }
}