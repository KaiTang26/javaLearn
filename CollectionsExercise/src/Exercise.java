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
	public static HashMap<String, Color> Question3() {
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

//	Question 4
	public static HashMap<Character, Integer> Question4(String input) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> result = new HashMap<Character, Integer>();
		
		Set<Character> holder = new HashSet<Character>();
		
		for(char i: input.toCharArray()){
			Character I = new Character(i);
			
			boolean test = holder.contains(I);
			
			if(!test){
				holder.add(I);
				result.put(I, new Integer(1));
			}else{
				result.replace(I, result.get(I)+1);
			}		
		}
		return result;
	}
	
	

}
