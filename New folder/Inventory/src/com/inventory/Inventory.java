package com.inventory;

public class Inventory {

	private int id;
	private String name;
	private int quantity;
	private double unitprice;

	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Inventory(int id, String name, int quantity, double unitprice) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.unitprice = unitprice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getUnitprice() {
		return unitprice;
	}
	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}
}
