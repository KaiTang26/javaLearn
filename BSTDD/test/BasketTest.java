
//import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.mockito.Mockito.*;




public class BasketTest {
	
	private static Basket basket;
	
	@BeforeClass
	public static void beforeClass(){
		Basket bas = mock(Basket.class);
		when(bas.add(1, 3)).thenReturn(6);
			
		basket = new Basket();
		
		System.out.println("before class");	
	}
	
	@Test
	public void test(){
		int result = bas.add(1,3);
		 
		Assert.assertEquals(4, result);
	}
	

	
	

}
