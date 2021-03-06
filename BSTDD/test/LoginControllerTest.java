import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

public class LoginControllerTest {
	
	private static loginController Lc;
	
	@Mock
	private static Validator mockVal;
	
	
	@Mock
	private static View mockView ;
	
	@BeforeClass
	public static void setup(){
		
//		System.out.println(mockView instanceof View);
		
//		initialize a mock object 
		
		LoginControllerTest lct = new LoginControllerTest();
		
		MockitoAnnotations.initMocks(lct);
		
		System.out.println(mockView instanceof View);
		
		Lc = new loginController(mockView,mockVal);
		
		when(mockView.getUserInput()).thenReturn("abcd");
		Lc.handle();
	}
	
	@Test
	public void test(){
		
		verify(mockVal).validate("abcd");
	}
	

}
