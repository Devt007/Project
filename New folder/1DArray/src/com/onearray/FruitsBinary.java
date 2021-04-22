package com.onearray;

/*
 * User ip enter no of fruits
 * User ip Enter fruit details
 * create method for validation
 * check the number for lowercase  and alphanumeric
 * Enter  input for fruit to be searched from user
 * use binary search
 * return op as yes or no
*/

import java.util.Scanner;

public class FruitsBinary {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of fruits");
		int n = sc.nextInt();
		String[] fruits = new String[n];
		System.out.println("Enter the fruits");
		for (int i = 0; i < fruits.length; i++) {
			fruits[i] = sc.next();
		}
		System.out.println("Enter the fruit you need to search? ");
		String name = sc.next();
		checkAlphaNumeric(name);
		int result = compareFruitsByBinarySearch(fruits, name);
		if (result == -1)
			System.out.println("No");
		else
			System.out.println("Yes");

	}

	private static void checkAlphaNumeric(String name) {
		// TODO Auto-generated method stub
		for (int i = 0; i < name.length(); i++) {
			if ((name.charAt(i)<='a'&& name.charAt(i)>='z')||(name.charAt(i) <= 'A' && name.charAt(i) >= 'Z')) {
				System.out.println("Enter non-special/Non-digit letters only");
			}
		}
	}
	

	private static int compareFruitsByBinarySearch(String[] fruits, String name) {
		// TODO Auto-generated method stub
		int low = 0, high = fruits.length - 1;
		while (low <= high) {
			int mid = low + (high - 1) / 2;
			int result = name.compareTo(fruits[mid]);  // mid = banana compare name=apple
			if (result == 0)                            //
				return mid;
			if (result > 0)
				low = mid + 1;
			else
				high = mid - 1;

		}
		return -1;

	}

}
