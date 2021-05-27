//Develop a program for an Insurance company
//Create a Menu driven program which takes “N” number of Policy details
//Policy class should have the following
//
//
//	
//	Id
//	Number
//	Type
//	PremiumFee
//	PremiumMode [ Quarterly, Halfyearly, yearly ]
//
//
//1. Add Policy details to the system and display all Policy details present in system
//2. Display policies whose premium fee is less than or equal to given Amount for given Mode
//3. Sort policy details by Number and display all Policy details present in system
//4. Update Premium Fee details for given Policy Number
//5. Exit

import java.util.Scanner;

import org.omg.PortableInterceptor.INACTIVE;

public class InsuranceApp {
static Scanner sc=new Scanner(System.in);
static int size;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Insurance[] insurance=null;
		boolean flag=true;
		
		do {
			display();
			int option=sc.nextInt();
			switch(option)
			{
			case 1:{
				insurance=addElements();
				displayDetails(insurance);
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
				displayPremiumFeeAndMode(insurance);
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
					Insurance[] sort=sortByNumber(insurance);
					displayDetails(sort);
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
					Insurance[] update=updateByFee(insurance);
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
	private static Insurance[] updateByFee(Insurance[] insurance) {
		// TODO Auto-generated method stub
		System.out.println("Enter the insuranceID : ");
		int id=sc.nextInt();
		System.out.println("Enter the premiumFee that you want to update : ");
		int fee=sc.nextInt();
		for(int i=0;i<insurance.length;i++)
		{
			if(Integer.compare(insurance[i].getInsuranceID(),id)==0)
			{
				insurance[i].setPremiumFee(fee);
			}
		}
		return insurance;
	}
	private static Insurance[] sortByNumber(Insurance[] insurance) {
		// TODO Auto-generated method stub
		int index=0;
		for(int i=0;i<size-1;i++)
		{
			index=i;
			for(int j=i+1;j<size;j++)
			{
				if(insurance[j].getInsuranceNumber() < insurance[index].getInsuranceNumber())
				{
					index=j;
				}
			}
			Insurance small=insurance[index];
			insurance[index]=insurance[i];
			insurance[i]=small;
			
		}
		return insurance;
		
	}
	private static void displayPremiumFeeAndMode(Insurance[] insurance) {
		// TODO Auto-generated method stub
		System.out.println("Enter the fee to display the details lesser than the fee: ");
		int fee=sc.nextInt();
		System.out.println("Enter the Mode : ");
		String mode=sc.next();
		for(int i=0;i<size;i++)
		{
			if(insurance[i].getPremiumFee()<=fee && insurance[i].getPremiumMode()==mode)
			{
				System.out.println(insurance[i]);
			}
		}		
	}
	private static Insurance[] addElements() {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of policies details that you want to enter ");
		size=sc.nextInt();
		Insurance[] addInsurance=new Insurance[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter the InsuranceId : ");
			int insuranceId=sc.nextInt();
			System.out.println("Enter the InsuranceNumber : ");
			int insuranceNumber=sc.nextInt();
			System.out.println("Enter the type of Insurance : ");
			String insuranceType=sc.next();
			System.out.println("Enter the premiumFee for the Insurance : ");
			int premiumFee=sc.nextInt();
			System.out.println("Enter the PremiumMode only as Quarterly or Yearly or Haflyear: ");
			String premiumMode=checkValidation();
			addInsurance[i]=new Insurance(insuranceId, insuranceNumber, insuranceType, premiumFee, premiumMode);
		}
		return addInsurance;
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
		if(!(s.equals("Quarterly")) && !(s.equals("quarterly")) &&
				!(s.equals("Halfyearly")) &&!(s.equals("halfyearly")) && !(s.equals("Yearly")) && !(s.equals("yearly"))) {
			System.out.println("You have entered the wrong Mode Please Enter the mode only as Quarterly or Yearly or Haflyear");
			return true;

		}
		return false;
	}
	private static void displayDetails(Insurance[] addInsurance) {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++)
		{
			System.out.println(" InsuranceId "+addInsurance[i].getInsuranceID()+" InsuranceNumber "
		+addInsurance[i].getInsuranceNumber()+" insuranceType "+addInsurance[i].getType()+" premiumFee "+addInsurance[i].getPremiumFee()
           +" premiumMode "+addInsurance[i].getPremiumMode());
		}
	}
	private static void display() {
		// TODO Auto-generated method stub
		System.out.println("-------------Insurance Company---------------");
		System.out.println("Enter 1) Add policy details and display all the policy details present in system");
		System.out.println("Enter 2) Display policies whose premium fee is less than or equal to given Amount for given Mode");
		System.out.println("Enter 3) Sort policy details by Number and display all Policy details present in system");
		System.out.println("Enter 4) Update Premium Fee details for given Policy Number");
		System.out.println("Enter 5) Exit");
	}

}
