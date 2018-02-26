package client;

import java.util.List;

import exceptions.ItemInRecallException;
import exceptions.NotInItemListException;
import exceptions.quantityException;
import objects.Inventory;
import objects.Order;
import objects.OrderLine;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			Inventory.addItemToStorage("Kai", 100);
			Inventory.addItemToStorage("Ball", 100);
			Inventory.addItemToStorage("PaintedBlock", 100);
			Inventory.addItemToStorage("Train", 100);
			Inventory.addItemToStorage("Airplane", 100);
		} catch (NotInItemListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
		}
		
		try {
			Inventory.setRecall("PaintedBlock");
		} catch (NotInItemListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
		}
		
		Order newOrder = new Order();
		
		newOrder.addOrder(new OrderLine("Ball", 100));
		
		checkout(newOrder);
		
	
	}
	
	public static void checkout(Order order){
		
		List<OrderLine> list= order.getOrderline();
		
		for(OrderLine item: list){
			
			
					try {
						Inventory.sellItem(item.getItemName(), item.getQuantity());
					} catch (NotInItemListException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ItemInRecallException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (quantityException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
			
		}
		
	}

}
