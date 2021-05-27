
public class Asset {
	private int Sno;
	private String Model;
	private String allocatedMonth;
	private int Quantity;
	public Asset() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Asset(int sno, String model, String allocatedMonth, int quantity) {
		super();
		this.Sno = sno;
		this.Model = model;
		this.allocatedMonth = allocatedMonth;
		this.Quantity = quantity;
	}
	public int getSno() {
		return Sno;
	}
	public void setSno(int sno) {
		Sno = sno;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getAllocatedMonth() {
		return allocatedMonth;
	}
	public void setAllocatedMonth(String allocatedMonth) {
		this.allocatedMonth = allocatedMonth;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	
	
}
