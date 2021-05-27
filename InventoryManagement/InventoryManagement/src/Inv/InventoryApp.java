package Inv;
import java.util.Scanner;

//Inventory Management
//
//Write a menu driver program for inventory management where Product(id, name, quantity,price per unit)
//
//1. Add new product in inventory.
       //Create a Inventory Class to add ProductId, ProductName, ProductQuantity, PricePerQUantity
       // Enter the Product details by asking the user in Main Class

//2. Update the quantity of particular product.
       //Ask the user how many product dose he/she want to update.
	   //And then ask the user to enter the ID of the Product that he want to update.
       //And then display the Updated Details of Inventory

//3. Display products where quantity is less than provided by a user.
      //Ask the user to enter the specific Quantity to search all the Quantities lesser than that
      //Display the Specific details according to the value Specified

//4. Display product sort on the basis of quantity.
     //Sort the products based on the Quantity

//5. Delete a particular product from inventory.
     //Ask the user to enter how many Products that he ant to delete
     //Ask the user specific Id that he want's to delete
     //Display the Products after deleting

//6. Exit
public class InventoryApp {
	static Scanner sc = new Scanner(System.in);
	static int size;
	static boolean flag;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inventory inventory[] = null;
		flag=true;
		do {
			System.out.println("----------------------Inventory Managment------------------------");
			System.out.println();
			System.out.println("Please Enter the following options");
			System.out.println("Enter 1) To add product to Inventory");
			System.out.println("Enter 2) To update the Quantity of particular product");
			System.out.println("Enter 3) Display products where quantity is less than provided by a user.");
			System.out.println("Enter 4) Display product sort on the basis of quantity.");
			System.out.println("Enter 5) Delete a particular product on the Inventory");
			System.out.println("Enter 6) Exit");
			byte option = sc.nextByte();
			switch (option) {
			case 1: {
				System.out.println("Enter the number of inventory to be added ");
				size = sc.nextInt();
				inventory = createStudent(size);
				break;
			}
			case 2: {
				if (size == 0) {
					System.out.println("Choose the 1st Option and then continue with the rest");
					break;
				} else
					updateQuantity(inventory);
				break;
			}
			case 3:
			{
				displayQuantityCondition(inventory);
				break;
			}
			case 4:
			{
				quantitySort(inventory);
				break;
			}
			case 5:
			{
				deleteProduct(inventory);
				break;
			}
			case 6:
				flag=false;
				break;
			}
		} while (flag);

	}

	private static void deleteProduct(Inventory[] arr) {
		// TODO Auto-generated method stub
		System.out.println("enter how many data to delete");
		Inventory[] arr2=new Inventory[arr.length-1];
		System.out.println("Enter the id of product that has to be deleted");
		int id=sc.nextInt();
		sc.nextLine();
		for (int i = 0, k = 0; i < arr.length; i++) { 
			if (arr[i].getId() == id) { 
				continue; 
			} 
			arr2[k++] = arr[i]; 
		} 


		displaySortedArray1(arr2);
}
	private static void displaySortedArray1(Inventory[] inventory1) {
		// TODO Auto-generated method stub
		for(int i=0;i<inventory1.length;i++)
		{
			System.out.println(inventory1[i].getId()+" "+inventory1[i].getName()+" "+inventory1[i].getPricePerQuantity()+" "+inventory1[i].getQuantity());
		}
		
	}

	private static void quantitySort(Inventory[] inventory) {
		// TODO Auto-generated method stub
		Inventory manage[]=inventory;
		System.out.println("The Products Sorted according to Quantity");
		for(int i=0;i<inventory.length;i++)
		{
			for(int j=i+1;j<inventory.length;j++)
			{
				if(manage[i].getQuantity() < manage[j].getQuantity())
				{
					Inventory smallest=manage[i];
					manage[i]=manage[j];
					manage[j]=smallest;
				}
				
			}
		}
		displaySortedArray(manage);
	}

	private static void displaySortedArray(Inventory[] manage) {
		// TODO Auto-generated method stub
		Inventory inventory[]=manage;
		for(int i=0;i<manage.length;i++)
		{
			System.out.println(inventory[i].getId()+" "+inventory[i]. getName()+" "+inventory[i].getPricePerQuantity()+" "+inventory[i].getQuantity());
		}
	}

	private static void displayQuantityCondition(Inventory[] inventory) {
		System.out.println("Enter the number of quantity to display the lesser values");
		int quantity=sc.nextInt();
		for(int i=0;i<inventory.length;i++)
		{
			if(inventory[i].getQuantity()<quantity)
			{
				System.out.println(inventory[i].getId()+" "+inventory[i]. getName()+" "+inventory[i].getPricePerQuantity()+" "+inventory[i].getQuantity());
			}
		}
		
	}

	private static void updateQuantity(Inventory[] inventory) {
		// TODO Auto-generated method stub
		System.out.println("Enter how many product's quantity do you want to update");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println("Enter the product id for which the quantity has to be updated");
			int id = sc.nextInt();
			if ((Integer.compare(inventory[i].getId(), id)) == 0) {
				System.out.println("Enter the updated quantity");
				int quantity = sc.nextInt();
				inventory[i].setQuantity(quantity);		
				}
		}
		System.out.println("Successfully Updated");	

	}

	private static Inventory[] createStudent(int size) {
		// TODO Auto-generated method stub
		Inventory creation[] = new Inventory[size];
			for (int i = 0; i < size; i++) {
				System.out.println("Enter the product ID");

				int id=sc.nextInt();
				System.out.println("Enter the name");
				String name = sc.next();
				System.out.println("Enter the Quantity");
				int quantity = sc.nextInt();
				System.out.println("Enter the price per quantity");
				int pricePerQuantity = sc.nextInt();
				System.out.println("-----------------");
				creation[i] = new Inventory(id, quantity, name, pricePerQuantity);
			}
		
		return creation;
	}


	
}

	
	