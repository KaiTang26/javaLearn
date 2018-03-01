import java.awt.print.Book;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;



public class BasketTest {
	
	private static Basket basket;
	private static Catalogue cata;
	
	@Mock
	private static ReaditermCommand Mockread;
	
	

	@BeforeClass
	public static void setup(){
		
		
//		when(Mockread.readAll()).thenReturn("abcd");
		
		
		
		
        System.out.println("test has been setup");
    }
	
	@Test 
	public void test_GetBooksInBasket_ReturnsEmptyBookList_IfNoBookHaveBeenAdded(){
		
		ArrayList<Book> bookList = basket.getBooksInBasket();
		
		Assert.assertEquals(0, bookList.size());
		
	}
	
	@Test 
	public void test_GetAllBooks_ReturnsEmptyBookList_IfNoBooksAreInTheCatalogue(){
		basket = new Basket();
//		cata = new Catalogue();
		
		BasketTest setup = new BasketTest();
		MockitoAnnotations.initMocks(setup);
		
		cata = new Catalogue(Mockread);
		cata.getAllBooks();
		
		verify(Mockread, times(1)).readAll();
		
	}
	
	
//	@Test 
//	public void testMethod(){
//		
//		Test setup = new Test();
//		MockitoAnnotations.initMocks(setup);
//		
//		ObjectForOutterClass = new Class_Contained_ClassNeedToBeMocked(MockObject);
//		
//		when(mockObject.innerMathod()).thenReturn("abc");
//		
//		ObjectForOutterClass.OutterMathod();
//		
//		verify(MocKObject, times(1)).innerMathod();
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
