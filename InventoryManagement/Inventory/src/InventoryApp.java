import java.util.Scanner;

//Inventory Management
//
//Write a menu driver program for inventory management where Product(id, name, quantity,price per unit)
//
//1. Add new product in inventory.
//
//2. Update the quantity of particular product. 3. Display products where quantity is less than provided by a user.
//
//4. Display product sort on the basis of quantity.
//
//5. Delete a particular product from inventory.
//
//6. Exit
public class InventoryApp {

	static Scanner sc = new Scanner(System.in);
	static int size;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		Inventory inventory[] = null;
		System.out.println("----------------------Inventory Managment------------------------");
		System.out.println();
		System.out.println("Please Enter the following options");
		System.out.println("Enter 1) To add product to Inventory");
		System.out.println("Enter 2) To update the Quantity of particular product");
		System.out.println("Enter 3) Display products where quantity is less than provided by a user.");
		System.out.println("Enter 4) Display product sort on the basis of quantity.");
		System.out.println("Enter 5) Delete a particular product on the basis of quantity.");
		System.out.println("Enter 6) Exit");
		byte option = sc.nextByte();
		do {
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
				} else
					updateQuantity(inventory);
				break;
			}
			}
		} while (flag);

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

	}

	private static Inventory[] createStudent(int size) {
		// TODO Auto-generated method stub
		Inventory creation[] = new Inventory[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the product ID");
			int id = sc.nextInt();
			System.out.println("Enter the name");
			String name = sc.nextLine();
			System.out.println("Enter the Quantity");
			int quantity = sc.nextInt();
			System.out.println("Enter the price per quantity");
			int pricePerQuantity = sc.nextInt();
			creation[i] = new Inventory(id, quantity, name, pricePerQuantity);
		}
		return creation;
	}

}
