package objects;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import exceptions.ItemInRecallException;
import exceptions.NotInItemListException;
import exceptions.quantityException;

public class Inventory {
	
	private static HashMap<String, Integer> storage = new HashMap<String, Integer>();
	private static HashSet<String> recall = new HashSet<String>();
	private static final Set<String> itemList = new HashSet<String>() {{
		add("Ball");
		add("PaintedBlock");
		add("Train");
		add("Airplane");
		
	}};
	
	
	public static void addItemToStorage(String item, int quantity) throws NotInItemListException 
	{
		if(!itemList.contains(item)){
			throw new NotInItemListException("Item not in list");
		}else{
			storage.put(item, quantity);
		}	
	}
	
	public static void setRecall(String item) throws NotInItemListException{
		if(!itemList.contains(item)){
			throw new NotInItemListException("Item not in list");
		}else{
			recall.add(item);
		}	
		
	}
	
	
	public static void sellItem(String item, int quantity) throws NotInItemListException, ItemInRecallException, quantityException{
		if(!itemList.contains(item)){
			throw new NotInItemListException("Item not in list");
			
		}else if(recall.contains(item)){
			throw new ItemInRecallException("Item in recall");
			
		}else if(quantity >storage.get(item)){
			
			throw new quantityException("not enough");
			
		}else{
			storage.put(item, storage.get(item)-quantity);
		}
		
	}
	
	
	
	

}
