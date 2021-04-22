package com.mobile;
//
//  1) Add mobile details  to system
//     -->Take user input to ask no of mobiles
//     -->Add mobile details to the system 
//     -->Diplay the mobile details from the system
//
//   2)Sort all mobiles based on the  model
//    --> Ask user ip for the model
//    -->sort the mobiles based on model which is equal to the user the ip 
//    -->After sorting display all the details mobile
//
//  3)update price for given mobie id
//    Enter user ip for mobile id
//    enter the price for user ip
//    set the price for particular mobile id if its present 
//    display update the price
//
//  4) Delete mobile details for particular id
//    Enter the user ip for id
//    check whether the id is present 
//    
//    if present delete all the respective details from the system
//     
//
//
//

import java.util.Scanner;


public class MobileApp {
	static Scanner scan = new Scanner(System.in);
	static int ch = 0;
	static Mobile[] p;
	private static int noofmobiles;
	static int count;
	
	public static void main(String[] args) {
		System.out.println("Welcome to mobile management system");

		do {
			displayMenu();
			ch = scan.nextInt();
			switch (ch) {
			case 1:
				addMobileDetails();
				break;

			case 2:
				sortAllMobiles();
				break;

			case 3:
				updatePrice();
				break;

			case 4:
				deleteMobileDetails();
				break;

			default:
				System.out.println("Invalid Input");
				System.exit(0);
				break;

			}
		} while (ch <5);
	}

	private static void displayMenu() {
		System.out.println("1.Add Mobile details to the system and display all Mobile details present in system");
		System.out.println("2.Sort all the mobiles based on Model and display the details");
		System.out.println("3.Update Price for given mobile id and display the details");
		System.out.println("4.Delete mobile details for given mobile id");
		System.out.println("5.Exit");

	}

	private static void addMobileDetails() {
		System.out.println("enter the number of mobiles");
		noofmobiles = scan.nextInt();
		count=noofmobiles;
		p = new Mobile[noofmobiles];// int [] a=new int[n];
		for (int i = 0; i < noofmobiles; i++) {
			System.out.println("Enter the id");
			int Id = scan.nextInt();

			System.out.println("Enter the model");
			String Model = scan.next();

			System.out.println("Enter  the price");
			double Price = scan.nextDouble();

			System.out.println("Enter the Date Of Manufacture");
			String DateOfManufacture = scan.next();

			p[i] = new Mobile(Id, Model, Price, DateOfManufacture);
		}
		for (int i = 0; i < noofmobiles; i++) {
			System.out.println(
					p[i].getId() + " " + p[i].getModel() + " " + p[i].getPrice() + " " + p[i].getDateOfManufacture());
		}

	}

	private static void sortAllMobiles() {

		Mobile[] mob = new Mobile[noofmobiles];
		mob = p;
		Mobile temp[] = new Mobile[noofmobiles];
		for (int i = 0; i < noofmobiles - i; i++) {
			for (int j = i + 1; j < noofmobiles; j++) {
				if (mob[i].getModel().compareTo(mob[j].getModel()) > 0) {
					temp[i] = mob[i];
					mob[i] = new Mobile(mob[j].getId(), mob[j].getModel(), mob[j].getPrice(),
							mob[j].getDateOfManufacture());
					mob[j] = new Mobile(temp[i].getId(), temp[i].getModel(), temp[i].getPrice(),
							temp[i].getDateOfManufacture());

				}
			}
		}

		for (int i = 0; i < noofmobiles; i++)
		{
			System.out.println(mob[i].getId()+" "+mob[i].getModel()+" "+mob[i].getPrice()+" "+mob[i].getDateOfManufacture());
		}
	}

	private static void updatePrice() {
		System.out.println("Enter the New Price");
		int price = scan.nextInt();
		System.out.println("Enter the Mobile Id");
		int id = scan.nextInt();

		for (int i = 0; i < noofmobiles; i++) {
			if (id == p[i].getId()) {
				p[i].setPrice(price);
				System.out.println("updated price is: " + p[i].getPrice());
			}
		}
		for (int i = 0; i < noofmobiles; i++)
		{
			System.out.println(p[i].getId()+" "+p[i].getModel()+" "+p[i].getPrice()+" "+p[i].getDateOfManufacture());
		}

	}
	public static Mobile[] removeTheElement(Mobile[] arr,int index) {

		if (arr == null || index < 0 || index >= arr.length) {
			return arr;
		}
		Mobile[] anotherArray = new Mobile[arr.length - 1];
		for (int i = 0, k = 0; i < arr.length; i++) {
			if (i == index) {
				continue;
			}
			anotherArray[k++] = arr[i];
		}
		return anotherArray;
	}



	private static void deleteMobileDetails()
	{
		count-=1;
		Mobile mb[]=new Mobile[count];
		System.out.println("Enter the product id");
		int productid=scan.nextInt();
		
		for(int i=0;i<noofmobiles;i++)
		{
			if(productid==p[i].getId())
			{
				mb=removeTheElement(p,i);
			}
		}
		for(int i=0;i<mb.length;i++)
		{
			System.out.println(mb[i].getId()+" "+mb[i].getModel()+" "+mb[i].getPrice()+" "+mb[i].getDateOfManufacture());
		}
		
	}

}