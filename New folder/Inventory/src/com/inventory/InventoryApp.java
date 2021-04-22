package com.inventory;

import java.util.Scanner;

/*1)Enter the no of products
 * Add new product in inventory -->array[]
 * Display the products
 * 
 * 2)Enter the number of quantity --> user i/p
 *   Enter the product id-->user ip
 *   compare the product id which is existing in the array with user ip 
 *   if both are same and then set user ip product id
 *   and then update the product id 
 *   
 * 3)  take user ip for quantity
 *     if qty of user ip is greater than existing display all details of products
 *     
 * 4)   Sort the array based  on quantity
 * 5) Delete particular product
 * search product id is available or not if its present delete that particular product 
 * 
 * 
 */

public class InventoryApp {

	static Scanner scan = new Scanner(System.in);
	static int noofproduct;
	static Inventory[] p;

	public static void main(String[] args) {
		System.out.println("Welcome to inventory management system");
		int ch = 0;

		do {
			displayMenu();
			ch = scan.nextInt();
			switch (ch) {
			case 1:
				addNewProduct();
				break;

			case 2:
				updateQuantityParticularProduct();
				break;

			case 3:
				displayProdducts();
				break;

			case 4:
				sortProductQuantity();
				break;
			case 5:
				deleteParticularProduct();
				break;
			
				
			default:
				System.out.println("invalid input");
				System.exit(0);
				break;
			}

		} while (ch < 6);

	}

	private static void displayMenu() {
		System.out.println("1.Add new product in inventory");
		System.out.println("2.Update quantity of particular product");
		System.out.println("3.Display products where quantity is less than provided by user");
		System.out.println("4.Display product sort on basis of quantity");
		System.out.println("5.Delete a particular product from inventory");

	}

	private static void addNewProduct() {
		System.out.println("enter the number of products");
		noofproduct = scan.nextInt();
		p = new Inventory[noofproduct];// int [] a=new int[n];
		for (int i = 0; i < noofproduct; i++) {
			System.out.println("Enter the id");
			int id = scan.nextInt();

			System.out.println("Enter the name");
			String name = scan.next();

			System.out.println("Enter  the quantity");
			int quantity = scan.nextInt();

			System.out.println("Enter the unit price");
			double unitprice = scan.nextDouble();

			p[i] = new Inventory(id, name, quantity, unitprice);

		}

	}

	private static void updateQuantityParticularProduct() {
		System.out.println("Enter the no of quantity");
		int quantity = scan.nextInt();
		System.out.println("Enter the  product id");
		int productid = scan.nextInt();

		for (int i = 0; i < noofproduct; i++) {
			if (productid == p[i].getId()) {
				p[i].setQuantity(quantity);
				System.out.println("updated quantity is: " + p[i].getQuantity());
			}
		}

	}

	private static void displayProdducts() {
		System.out.println("Enter the quantity");
		int quantity = scan.nextInt();

		for (int i = 0; i < noofproduct; i++) {
			if (quantity >= p[i].getQuantity()) {

				System.out.println(
						p[i].getName() + " " + p[i].getId() + " " + p[i].getQuantity() + " " + p[i].getUnitprice());
			}
		}
	}

	private static void sortProductQuantity() {
		Inventory[] inventory = new Inventory[noofproduct];
		inventory = p;
		Inventory temp[] = new Inventory[noofproduct]; 
		for (int i = 0; i < noofproduct - i; i++) {
			for (int j = i + 1; j < noofproduct; j++) {
				if (inventory[i].getQuantity() > inventory[j].getQuantity()) {
					temp[i] = inventory[i];
					inventory[i] = new Inventory(inventory[j].getId(), inventory[j].getName(),
							inventory[j].getQuantity(), inventory[j].getUnitprice());
					inventory[j] = new Inventory(temp[i].getId(), temp[i].getName(), temp[i].getQuantity(),
							temp[i].getUnitprice());

				}
			}
		}
		for (int i = 0; i < noofproduct; i++) {
			System.out.println(inventory[i].getName() + " " + inventory[i].getId() + " " + inventory[i].getQuantity()
					+ " " + inventory[i].getUnitprice());
		}
	}

	public static Inventory[] removeTheElement(Inventory[] arr,int index) {

		if (arr == null || index < 0 || index >= arr.length) {
			return arr;
		}
		Inventory[] anotherArray = new Inventory[arr.length - 1];
		for (int i = 0, k = 0; i < arr.length; i++) {
			if (i == index) {
				continue;
			}
			anotherArray[k++] = arr[i];
		}
		return anotherArray;
	}



	private static void deleteParticularProduct()
	{
		System.out.println("Enter the product id");
		int productid=scan.nextInt();
		
		for(int i=0;i<noofproduct;i++)
		{
			if(productid==p[i].getId())
			{
				p=removeTheElement(p,i);
			}
		}
	
	}

}
