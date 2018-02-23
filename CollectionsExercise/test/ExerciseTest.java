import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Assert;
import org.junit.Test;

public class ExerciseTest {
	
	@Test
	public void Q2(){
		System.out.println("test case for Q2");
		
		List<String> input = new ArrayList<String>();
		
		input.add("Kai");
		input.add("Kai");
		input.add("Kai");
		input.add("Siyang");
		input.add("Wu");
		
		Set<String> result = Exercise.Question2(input);
		
		Set<String> answer = new HashSet<String>();
		answer.add("Kai");
		answer.add("Siyang");
		answer.add("Wu");
		
		Assert.assertEquals(answer, result);		
	}
	
	@Test
	public void Q3(){
		System.out.println("test case for Q3");		
		HashMap<String, Color> result = Exercise.Question3();
			
		Assert.assertEquals(Color.BLACK, result.get("BLACK"));		
	}
	
	@Test
	public void Q4(){
		System.out.println("test case for Q4");	
		HashMap<Character, Integer> result = Exercise.Question4("HELLO THERE");
	
		Assert.assertEquals(new Integer(3), result.get(new Character('E')));		
	}
	
	@Test
	public void Q5(){
		System.out.println("test case for Q5");
		int result = Exercise.Question5("HELLO hello There THERE");
		Assert.assertEquals(2, result);		
	}
	
	@Test
	public void Q6(){
		System.out.println("test case for Q6");
		LinkedList<String> input = new LinkedList<String>();
		input.add("A");
		input.add("B");
		input.add("C");
		input.add("D");
		input.add("E");
		input.add("F");
		LinkedList<String> result = Exercise.Question6(input);
		
		Assert.assertEquals("F", result.get(0));		
	}
	
	@Test
	public void Q7(){
		System.out.println("test case for Q7");
		
		TreeSet<String> result = Exercise.Question7("Suzuki Honda Toyota Ford Renault Hyundai");
		
		Assert.assertEquals("Ford", result.pollFirst());		
	}
	
	@Test
	public void Q8(){
		System.out.println("test case for Q8");
		
		PriorityQueue<Double> result = Exercise.Question8(2.2, 14.8);
		
		Assert.assertEquals(2.2, result.poll(),0.1);		
	}
	
	
	
	
	
	

}
