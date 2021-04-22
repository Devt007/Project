package com.onearray;
/*   1) Take two user ip Arrays
 *   2)Display those 2 user ip arrays 
 *   3) Subtract those 2 input arrays
 *   4) Display the result of subtracted 
 *   5) Sort the only the negative values from the array
 *   6)print the sorted array
 */
import java.util.Scanner;



public class OneDimArray {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
        
		System.out.println("Enter the no of  values. ");
		int n = scan.nextInt();
		int a[] = new int[n];
	
		System.out.println("Enter the no of  values to be stored in first array ");
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("The elements of first array are");
		for (int i = 0; i < n; i++) {

			System.out.print(a[i] + " ");
		}
		
		int b[] = new int[n];
		System.out.println("\nEnter the no of  values to be stored in second array ");
		for (int i = 0; i < n; i++) {
			b[i] = scan.nextInt();
		}
		System.out.println("The elements of second array are");
		for (int i = 0; i < n; i++) {

			System.out.print(b[i] + " ");
		}
		System.out.println();
		subtractTwoArray(a,b);
	}
	
	public static void subtractTwoArray(int []a,int []b)
	{
		int n = a.length;
		int temp[]=new int[n];
		for(int i=0;i<n;i++)
		{
			temp[i]=a[i]-b[i];
		}
		System.out.println("Resultant Array");
		for(int i=0;i<n;i++)
		{
			System.out.print(temp[i]+" ");
		}
		System.out.println("\n Array after sorting");
		for(int i=0;i<n;i++)
		{
			if(temp[i]<0)
			{
				System.out.print(temp[i]+" ");
			}
		}
	}
}
