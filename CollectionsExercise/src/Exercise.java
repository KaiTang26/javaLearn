import java.awt.Color;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

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

//	Question 5
	public static int Question5(String string) {
		// TODO Auto-generated method stub
		String input = string.toLowerCase();
		String[] arr = input.replaceAll("[^a-zA-Z ]", "").split(" ");
		
		Set<String> holder = new HashSet<String>();
		
		int count = 0;
		
		for(String i: arr){
			boolean test = holder.contains(i);
			
//			System.out.println(i);
		
			if(!test){
				holder.add(i);
			}else{
				count++;
				
			}
			
		}
		
		return count;
	}

//	Question 6
	
	public static LinkedList<String> Question6(LinkedList<String> input) {
		// TODO Auto-generated method stub
		
		LinkedList<String> result = new LinkedList<String>();
		
		for(int i=input.size()-1; i>=0; i--){
			
			result.add(input.get(i));
//			System.out.println(input.get(i));
			
		}
		return result;
	}
	
//	Question7
	public static TreeSet<String> Question7(String string) {
		// TODO Auto-generated method stub
		
		TreeSet<String> result = new TreeSet<String>();
		
		String[] input = string.split(" ");
		
		for(int i=0; i<input.length; i++){
			
			result.add(input[i]);
		}
		return result;
	}

//	Question 8
	public static PriorityQueue<Double> Question8(double ... a) {
		// TODO Auto-generated method stub
		PriorityQueue<Double> result = new PriorityQueue<Double>(); 
		
		for(double i : a){
			
			result.add(i);
			
		}
		return result;
	}
	
	
	
	
	
	
	

}
