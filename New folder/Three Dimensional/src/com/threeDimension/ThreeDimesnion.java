package com.threeDimension;
//read the matrix size from user
//check for odd numbers in primary diagonal
//if odd num found increase count by 1
//find sum of ood num in primary diagonal
//find the avrg of sum in primary diagonal and repeat same for secondary
import java.util.Scanner;

public class ThreeDimesnion {
	static Scanner Scan = new Scanner(System.in);

	public static float primaryDiagonal(int arr[][]) {

		int a = arr.length;
		float temp = 0;
		int count = 0;
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				if (i == j) {
					if (arr[i][j] % 2 != 0) {
						temp += arr[i][j];
						count++;
					}
				}
			}
		}
		if(count!=0)
		return temp / count;
		else
			return 0;
	}

	public static float secondaryDiagonal(int arr[][]) {

		int a = arr.length;
		float temp = 0;
		int count = 0;
		for (int i = 0; i < a; i++) {
			for (int j = arr[i].length - 1; j >= 0; j--) {
				if (i + j == arr[i].length - 1) {
					if (arr[i][j] % 2 != 0) {
						
						temp += arr[i][j];
						count++;
					}
				}
			}
		}
		if(count!=0)
		return temp / count;
		else
			return 0;
	}

	public static void main(String[] args) {
		System.out.println("Enter the length of the matrix");
		int a = Scan.nextInt();
		System.out.println("Enter matrix elements:");
		int arr[][] = new int[a][a];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				arr[i][j] = Scan.nextInt();
			}
		}
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("The average of odd elements in primary diagonal array are");
		System.out.println(primaryDiagonal(arr));
		System.out.println("The average of odd elements in secondary diagonal array are");
		System.out.println(secondaryDiagonal(arr));
	}
}
