package com.stringalphanumeric;

import java.util.Scanner;

public class StringAlphaNumeric {

	static Scanner scan = new Scanner(System.in);

	public static String distinctValues(String str) {

	}

	public static void main(String[] args) {
		System.out.println("Enter the 1st string");
		String a = scan.next();

		char arr1[] = new char[a.length()];

		for (int i = 0; i < a.length(); i++) {
			arr1[i] = a.charAt(i);
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);
		}

		System.out.println("\nEnter the 2nd string");
		String b = scan.next();
		char arr2[] = new char[b.length()];
		for (int j = 0; j < b.length(); j++) {
			arr2[j] = b.charAt(j);
		}
		for (int j = 0; j < arr2.length; j++) {
			System.out.print(arr2[j]);
		}

		String word = "";
		String number = "";
		for (int i = 0; i < a.length(); i++) {
			if (findAlpha(arr1[i])) {
				word += arr1[i];
			} else {
				number += arr1[i];
			}
		}

		for (int i = 0; i < b.length(); i++) {
			if (findAlpha(arr2[i])) {
				word += arr2[i];
			} else {
				number += arr2[i];
			}
		}
		System.out.println("\nWord:" + word + "\nNumbers:" + number);

	}

	public static boolean findAlpha(char ch) {
		if ((ch >= 65 && ch <= 91) || (ch >= 97 && ch <= 122)) {
			return true;
		} else
			return false;
	}
}
