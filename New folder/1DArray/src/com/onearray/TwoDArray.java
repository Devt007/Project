package com.onearray;

/* 
 * Take ip of the of array size from user
 * take the ip for rows and columns 
 * print the rows and columns of 2d array
 * create max and min variable of 2d array size
 * traverse through the array
 * get the max of i and j
 * get the min of i and j
 * swap 
 * print the array
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
import java.util.Scanner;

public class TwoDArray {

	public static void main(String args[]) {

		System.out.print("Enter 2D array size : ");
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int columns = sc.nextInt();

		System.out.println("Enter array elements : ");

		int twoD[][] = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				twoD[i][j] = sc.nextInt();
			}
		}
		System.out.print("\nData you entered : \n");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(twoD[i][j] + " ");
			}
			System.out.println();
		}

		int max = twoD[0][0];
		int min = twoD[0][0];
		int maxIndex1 = 0;
		int maxIndex2 = 0;
		int minIndex1 = 0;
		int minIndex2 = 0;

		System.out.println("The matrix is : ");
		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD[i].length; j++) {

				if (twoD[i][j] > max) {
					max = twoD[i][j];

					maxIndex1 = i;
					maxIndex2 = j;
				} else if (twoD[i][j] < min) {
					min = twoD[i][j];

					minIndex1 = i;
					minIndex2 = j;
				}
			}
		}
		int temp = twoD[maxIndex1][maxIndex2];
		twoD[maxIndex1][maxIndex2] = twoD[minIndex1][minIndex2];
		twoD[minIndex1][minIndex2] = temp;

		System.out.print("\nAfter Swapping: \n");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(twoD[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("After Second Swap:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (i == 0) {
					if (i == 0 && j == 0) {
						continue;
					} else {
						for (int k = 1; k < rows; k++) {
							for (int l = 1; l < columns; l++) {
								if (j - k == 0 && k == l) {
									temp = twoD[i][j];
									twoD[i][j] = twoD[k][l];
									twoD[k][l] = temp;
								}
							}
						}
					}
				}
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(twoD[i][j] + " ");
			}
			System.out.println();
		}

	}
}
