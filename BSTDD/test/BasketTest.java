
//import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;




public class BasketTest {
	
	@Mock
	private static Basket basket;
	
	@BeforeClass
	public static void beforeClass(){
		BasketTest amt = new BasketTest();
		MockitoAnnotations.initMocks(amt);
		
		
		when(basket.add(1, 3)).thenReturn(6);
			
		
		System.out.println("before class");	
	}
	
	@Test
	public void test(){
		
		 int result = basket.add(1, 3);
		Assert.assertEquals(6, result);
	}
	

	
	

}
