
public class Mobile {
	private int productID;
	private int productModel;
	private int productPrice;
	private String DateOfManufacture;
	public Mobile(int productID, int productModel, int productPrice, String dateOfManufacture) {
		super();
		this.productID = productID;
		this.productModel = productModel;
		this.productPrice = productPrice;
		this.DateOfManufacture = dateOfManufacture;
	}
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public int getProductModel() {
		return productModel;
	}
	public void setProductModel(int productModel) {
		this.productModel = productModel;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getDateOfManufacture() {
		return DateOfManufacture;
	}
	public void setDateOfManufacture(String dateOfManufacture) {
		this.DateOfManufacture = dateOfManufacture;
	}
	
	

}
