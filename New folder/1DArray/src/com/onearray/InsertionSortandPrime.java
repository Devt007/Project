package com.onearray;

/* Take user input for integer array
 * Read the values 
 * Store the values in array and display it
 * Sort using insertion sort 
 * Display only the prime numbers present in sorted array
 * 
 * 
 */
import java.util.Scanner;

public class InsertionSortandPrime {

	void sort(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		System.out.println("\nAfter Sorting:");
		printArray(arr);
		System.out.println("Prime numbers in the array:");
		PrimeNumber(arr);
	}

	void PrimeNumber(int array[]) {
		boolean isPrime=true;
		for (int i = 0; i < array.length; i++) {
			for(int j=2;j<array[i];j++)
			{
			if(array[i]%j==0)
			{
				isPrime=false;
			}
			}
			// print the number
			if (isPrime)
				System.out.print(array[i] + " ");
		}
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int n = scan.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Before Sorting:");
		printArray(arr);
		InsertionSortandPrime ob = new InsertionSortandPrime();
		ob.sort(arr);

	}
}