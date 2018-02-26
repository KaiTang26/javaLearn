package client;

import exceptions.NotInItemListException;
import objects.Inventory;

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
		
		

	}

}
