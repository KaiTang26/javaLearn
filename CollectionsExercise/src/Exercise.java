import java.awt.Color;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise {
//	Question 1
	
//	Question 2 
	public static Set<String> Question2(List<String> fistName){
		// TODO Auto-generated method stub
		
		Set<String> ans = new HashSet<String>(fistName);	
		
		return ans;
	}
	
//	Question 3
	public static HashMap<String, Color> Questions() {
		// TODO Auto-generated method stub
		
		HashMap<String, Color> result = new HashMap<String, Color>();
		result.put("BLACK", Color.BLACK);
		result.put("BLUE", Color.BLUE);
		result.put("CYAN", Color.CYAN);
		result.put("DARK_GRAY", Color.DARK_GRAY);
		result.put("GRAY", Color.GRAY);
		result.put("GREEN", Color.GREEN);
		result.put("BLACK", Color.BLACK);
		result.put("LIGHT_GRAY", Color.LIGHT_GRAY);
		
		return result;
	}
	
	

}
