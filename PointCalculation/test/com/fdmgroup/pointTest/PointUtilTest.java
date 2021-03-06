package com.fdmgroup.pointTest;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;



public class PointUtilTest {
	
	private static points point1;
	private static points point2;
	private static PointUtil pu;
	
	@BeforeClass
	public static void setup(){
		point1 = new points(1,2);
		point2 = new points(4,5);
		pu = new PointUtil();
		
		System.out.println("set up the test for point utility");
		
	}
	
	@Test
	public void testDistance(){
		double result = pu.distance(point1, point2);
		Assert.assertEquals(3.74, result,0.1);
	}
	


}
