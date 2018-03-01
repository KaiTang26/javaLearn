

import org.junit.Assert;
import org.junit.Test;

import model.Major;

public class Tester {
	@Test
	public void TestForMajor(){
		System.out.println("test case for major class");
		Major result = new Major("Engineering","Very hard");
		Assert.assertEquals("Engineering", result.getObject());		
	}

}
