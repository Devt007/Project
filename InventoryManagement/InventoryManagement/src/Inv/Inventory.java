package Inv;
public class Inventory {
	private int id, quantity, pricePerQuantity;;
	private String name;
	public Inventory() 
	{
		super();
	}
	public Inventory(int id, int quantity, String name, int pricePerQuantity) {
		super();
		this.id = id;
		this.quantity = quantity;
		this.name = name;
		this.pricePerQuantity = pricePerQuantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPricePerQuantity() {
		return pricePerQuantity;
	}
	public void setPricePerQuantity(int pricePerQuantity)
	{
		this.pricePerQuantity = pricePerQuantity;
	}
}
