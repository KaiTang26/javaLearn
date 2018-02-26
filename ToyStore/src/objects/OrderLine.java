package objects;

public class OrderLine {
	
	private String itemName;
	
	private int quantity;

	public OrderLine(String itemName, int quantity) {
		super();
		
		this.itemName = itemName;
		this.quantity = quantity;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
