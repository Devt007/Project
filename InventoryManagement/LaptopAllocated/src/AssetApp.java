//Implement menu driven program for tracking the Assets allotted
//Asset class should have the following
//
//
//	
//	Sno
//	Model [ HP , Lenovo , Dell ]
//	AllottedMonth -> Should be taken 3 letter word Eg : JAN/FEB ..
//	Quantity
//
//
//1. Add asset details to the system and display all asset details
//2. Search assets for given Month and sort the data by Model
//Example : If input is provided as FEB, it should display details of all assets allotted in the month of FEB sorted by Model
//3. Display total quantity allotted for given Model
//Example : If input is provided as ‘HP’ display total quantity allotted by summing up all months
//4. Update Quantity for given Model and display the updated details
//5. Exit

	
import java.util.Scanner;
public class AssetApp {
static Scanner sc=new Scanner(System.in);
static int size;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Asset[] asset=null;
		boolean flag=true;
		
		do {
			display();
			int option=sc.nextInt();
			switch(option)
			{
			case 1:{
				asset=addElements();
				displayDetails(asset);
				break;
			}
			case 2:
			{
				if(size==0)
				{
					System.out.println("Please choose the option 1 and proceed ");
					break;
				}
				else
				searchByModel(asset);
				break;
			}
			case 3:
			{
				if(size==0)
				{
					System.out.println("Please choose the option 1 and proceed ");
					break;
				}
				else {
					int quantity=displayQuantity(asset);
					System.out.println("The Total Quantity is : "+quantity);
					break;
				}	
			}
			case 4:
			{
				if(size==0)
				{
					System.out.println("Please choose the option 1 and proceed ");
					break;
				}
				else {
					Asset[] update=updateByQuantity(asset);
					displayDetails(update);
					break;
				}	
			}
			case 5:
			{
				flag=false;
				break;
				
			}
			}
		}while(flag);

	}
	private static void searchByModel(Asset[] asset) {
		// TODO Auto-generated method stub
			int index;
			for(int i=0;i<asset.length-1;i++)
			{
				index=i;
				for(int j=i+1;j<size;j++)
				{
					if(asset[index].getModel().compareTo(asset[i].getModel())>0)
					{
						index=j;
					}
					
				}
				Asset small=asset[index];
				asset[index]=asset[i];
				asset[i]=small;
			}
			searchModel(asset);
	}
	private static Asset[] updateByQuantity(Asset[] assets) {

		// TODO Auto-generated method stub
		System.out.println("Enter the Model : ");
		String s=checkValidation();
		System.out.println("Enter the quantity : ");
		int quantity=sc.nextInt();
		for(int i=0;i<assets.length;i++)
		{
			if(assets[i].getModel().equals(s))
			{
				assets[i].setQuantity(quantity);
			}
			
		}
		return assets;
	}

	private static int displayQuantity(Asset[] assets) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Model : ");
		String s=checkValidation();
		int quantity=0;
		for(int i=0;i<assets.length;i++)
		{
			if(assets[i].getModel().equals(s))
			{
			quantity+=assets[i].getQuantity();
			}
			
		}
		return quantity;
		
	}

	private static void searchModel(Asset[] asset) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Month's in 3 LETTERS  to display details : ");
		String s = validation();
		
		for (int i = 0; i < asset.length; i++) {
			if((asset[i].getAllocatedMonth().compareTo(s))==0) {
				System.out.println(" Sno "+asset[i].getSno()+
						" Model "+asset[i].getModel()+" allocatedMonth "
						+asset[i].getAllocatedMonth()+" Quantity "+asset[i].getQuantity());
			}
			
		}
	}

	
	private static Asset[] addElements() {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of policies details that you want to enter ");
		size=sc.nextInt();
		Asset[] addAsset=new Asset[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the Sno : ");
			int Sno=sc.nextInt();
			System.out.println("Enter the Model only as Lenovo or Hp or Dell : ");
			String Model=checkValidation();
			System.out.println("Enter the Allocated Month : ");
			String allocatedMonth=validation();
			System.out.println("Enter the Quantity : ");
			int Quantity=sc.nextInt();
			addAsset[i]=new Asset(Sno, Model, allocatedMonth, Quantity);
		}
		return addAsset;
	}
	
	private static String validation() {
		// TODO Auto-generated method stub
		String s;
		do
		{
			s=sc.next();
		}while(month(s));
		return s;
	}
			
			private static boolean month(String s) {
		// TODO Auto-generated method stub
				if(!(s.length()>3) && !(s.equals("JAN")) && !(s.equals("FEB")) && !(s.equals("MAR")) && !(s.equals("APR")) && !(s.equals("MAY")) &&!(s.equals("JUN")) &&  !(s.equals("JUL")) && !(s.equals("AUG")) && !(s.equals("SEP"))&& 
						!(s.equals("OCT")) &&
						!(s.equals("NOV"))&& !(s.equals("DEC")))
				{
					System.out.println("Please Enter the correct Month and the formate should be in THREE LETTER'S only such as JAN/FEB/MAR... : ");
					return true;
				}
			
		return false;
	}
			
	
	private static String checkValidation() {
		// TODO Auto-generated method stub
		String s;
		do
		{
			s=sc.next();
		}while(status(s));
		return s;
	}

	private static boolean status(String s) {
		// TODO Auto-generated method stub
		if(!(s.equals("HP")) && !(s.equals("hp")) &&
				!(s.equals("Lenovo")) &&!(s.equals("lenovo")) && !(s.equals("DELL")) && !(s.equals("dell"))  && !(s.equals("Dell"))) {
			System.out.println("You have entered the wrong Model Please Enter the mode only as either Lenovo or Hp or Dell");
			return true;

		}
		return false;
	}
	private static void displayDetails(Asset[] asset) {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++)
		{
			System.out.println(" Sno "+asset[i].getSno()+
					" Model "+asset[i].getModel()+" allocatedMonth "
					+asset[i].getAllocatedMonth()+" Quantity "+asset[i].getQuantity());
		}
	}
	private static void display() {
		// TODO Auto-generated method stub
		System.out.println("-------------Asset Company---------------");
		System.out.println("Enter 1) Add Asset details and display all the asset details present in system");
		System.out.println("Enter 2) Search assets for given Month and sort the data by Model");
		System.out.println("Enter 3) Display total quantity allotted for given Model");
		System.out.println("Enter 4) Update Quantity for given Model and display the updated details");
		System.out.println("Enter 5) Exit");
	}

}
