import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

}
