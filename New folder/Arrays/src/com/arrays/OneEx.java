package com.arrays;

import java.util.Scanner;

public class OneEx {

	static Scanner scan=new Scanner(System.in);
	static int i=0;
	
	public static void main(String[] args) {
	
		
		System.out.println("Enter the number of array");
		int n=scan.nextInt();
		
		int arr1[]=new int[n];
		
		System.out.println("Enter elements of  first array are");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=scan.nextInt();
		}
		System.out.println("elements of  first array are:");
		for (int i = 0; i < arr1.length; i++) {
		System.out.println(arr1[i]);
		}
		System.out.println("elements of  Second array are:");
		int arr2[]=arr1;
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
			}
	}
	

	

}
