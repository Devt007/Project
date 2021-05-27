import java.util.Scanner;

/*
 * Take two 1D array as input from the user.
 * After that subtract the 1st array from 2nd array and store it in another tempArray.
 * Write a condition to extract all the negative elements from tempArray.
 */


public class NegativeNumbers {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-----Enter two 1D Array-----");
		System.out.println("Enter the size of the two arrays");
		int size=sc.nextInt();
		creareArray(size);		

	}

	private static void creareArray(int size) {
		// TODO Auto-generated method stub
		int[] arr1=new int[size]; 
		System.out.println("Enter the 1st Array");
		for(int i=0;i<size;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int[] arr2=new int[size];
		System.out.println("Enter the 2nd Array");
		for(int i=0;i<size;i++)
		{
			arr2[i]=sc.nextInt();
		}
		deletion(arr1,arr2);
	}

	private static void deletion(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		int[] negative=new int[arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			negative[i]=arr1[i]-arr2[i];
			System.out.print(negative[i]+" ");
		}
		System.out.println("");
		
		nonNegative(negative);
	}

	private static void nonNegative(int[] negative) {
		// TODO Auto-generated method stub
		System.out.println("Negative Numbers are");
		for(int i=0;i<negative.length;i++)
		{
			if(negative[i]<0)
			{
				System.out.print(negative[i]+" ");
			}
		}
	}

}
