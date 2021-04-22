package com.mobile;

public class Mobile {

	private int Id;
	private String Model;
	private double Price;
	private String DateOfManufacture;
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(int id, String model, double price, String dateOfManufacture) {
		super();
		Id = id;
		Model = model;
		Price = price;
		DateOfManufacture = dateOfManufacture;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public String getDateOfManufacture() {
		return DateOfManufacture;
	}
	public void setDateOfManufacture(String dateOfManufacture) {
		DateOfManufacture = dateOfManufacture;
	}

}