import java.util.Scanner;
//Mobile Store
//
//1. Add new mobile to the store.
       //Create a Mobile Class to add ProductId, ProductModels, ProductPrice, DateOfManufacture.
       // Enter the Mobile details by asking the user in Main Class.

//2. Sort all the Mobile based on Model and Display.
       //Ask the user how many mobile dose he/she want to add.
	   //And then ask the user to enter the Model and display.

//3.  Update the price of a Mobile.
      //Ask the user to enter the ProductId.
      //Display the Specific details according to the ProductId.

//4. Delete a particular mobile from store.
     //Ask the user to enter the productID
     //Display the Products after deleting

//5. Exit
public class MobileApp {
	static Scanner sc = new Scanner(System.in);
	static int size;
	static boolean flag;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mobile[] = null;
		flag=true;
		do {
			display();
			byte option = sc.nextByte();
			switch (option) {
			case 1: {
				System.out.println("Enter the number of mobiles to be added ");
				size = sc.nextInt();
				mobile = createMobile(size);
				break;
			}
			case 2: {
				if (size == 0) {
					System.out.println("Choose the 1st Option and then continue with the rest");
					break;
				} else
				mobileSort(mobile);
				break;
			}
			case 3:
			{
				if (size == 0) {
					System.out.println("Choose the 1st Option and then continue with the rest");
					break;
				} else
					updatePrice(mobile);
				break;
			}
			case 4:
			{
				deleteMobile(mobile);
				break;
			}
			case 5:
				flag=false;
				break;
			}
		} while (flag);

	}

	private static void display() {
		// TODO Auto-generated method stub
		System.out.println("----------------------Mobile Store------------------------");
		System.out.println();
		System.out.println("Please Enter the following options");
		System.out.println("Enter 1) To add Mobile to store");
		System.out.println("Enter 2) Sort all the mobiles based on productID.");
		System.out.println("Enter 3) Update the price for a Mobile based on productID.");
		System.out.println("Enter 4) Delete a paticular mobile based on productID");
		System.out.println("Enter 5) Exit");
		
	}

	private static void deleteMobile(Mobile[] arr) {
		// TODO Auto-generated method stub
		Mobile[] arr2=new Mobile[arr.length-1];
		System.out.println("Enter the id of product that has to be deleted");
		int id=sc.nextInt();
		sc.nextLine();
		for (int i = 0, k = 0; i < arr.length; i++) { 
			if (arr[i].getProductID() == id) { 
				continue; 
			} 
			arr2[k++] = arr[i]; 
		} 


		displaySortedArray(arr2);
}

	private static void mobileSort(Mobile[] mobilesort) {
		// TODO Auto-generated method stub
		Mobile manage[]=mobilesort;
		System.out.println("The Mobiles are Sorted according to MobileId");
		for(int i=0;i<mobilesort.length;i++)
		{
			for(int j=i+1;j<mobilesort.length;j++)
			{
				if(manage[i].getProductModel() > manage[j].getProductModel())
				{
					Mobile smallest=manage[i];
					manage[i]=manage[j];
					manage[j]=smallest;
				}
				
			}
		}
		displaySortedArray(manage);
	}

	private static void displaySortedArray(Mobile[] manage) {
		// TODO Auto-generated method stub
		Mobile displayMobile[]=manage;
		for(int i=0;i<manage.length;i++)
		{
			System.out.println("Produt ID = "+displayMobile[i].getProductID()+" Produt Model = "+displayMobile[i]. getProductModel()
					+" Produt Price = "+displayMobile[i].getProductPrice()+" Date Of Manufacture "+displayMobile[i].getDateOfManufacture());
			
		}
	}

	private static void updatePrice(Mobile[] updateMobile) {
		// TODO Auto-generated method stub
		System.out.println("Enter how many product's price do you want to update");
		int num = sc.nextInt();
		for (int j = 0; j < num; j++) {
			System.out.println("Enter the productID for which the price has to be updated");
			int id = sc.nextInt();
			System.out.println("Enter the updated Price");
			int price = sc.nextInt();
			for(int i=0;i<updateMobile.length;i++)
			{
				if ((Integer.compare(updateMobile[i].getProductID(), id)) == 0) {
					
					updateMobile[i].setProductPrice(price);		
					}
			}
		}
		System.out.println("Successfully Updated");	
        displaySortedArray(updateMobile);
	}

	private static Mobile[] createMobile(int size) {
		// TODO Auto-generated method stub
		
		 int[] a=new int[size];
		 int count[]=new int[1];
		 int count1[]=new int[1];
		 Mobile creation[] = new Mobile[size];
			for (int i = 0; i < size; i++) {
				System.out.println("Enter the productID");
				int mobileId=productId(a,count,count1,i);
				System.out.println("Enter the Model");
				int productModel = sc.nextInt();
				System.out.println("Enter the Price");
				int productPrice = sc.nextInt();
				System.out.println("Enter the DAte of manufacture");
				String DateOfManufacture = sc.next();
				sc.nextLine();
			
			System.out.println("-----------------");
				creation[i] = new Mobile(mobileId, productModel, productPrice, DateOfManufacture);
			}
		
		return creation;
	}

	private static int productId(int[] a, int[] count, int[] count1,int i) {
		// TODO Auto-generated method stub
		 int id;
         do {

        	 id=sc.nextInt();
         }
         while(unique(id,a,count,count1,i));
         return id;
     }
	

	private static boolean unique(int id,int[] a,int[] count,int[] count1, int i) {
		// TODO Auto-generated method stub+		
		boolean flag1 = true;
		a[count1[0]]=id;
		count1[0]++;
		for(int j=0;j<count1[0];j++)
		{  
			 for (int k = 0; k < count1[0]; k++)
             {
                if(a[j]==a[k] && j!=k) {
                	--count1[0];
             System.out.println("Enter the Non Repeated Id :");
             flag1=true;
			 return flag1;
                }
             }
			 if(count[0]==0) 
					flag1=false;
         }
		return flag1;
		}
	}


	


	
