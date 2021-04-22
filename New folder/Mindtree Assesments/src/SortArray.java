import java.util.Scanner;
/* User ip to read number of elements
 * Enter array elements user ip
 * Read the elements in an array 
 * Display elements of array
 * 
 * Sort the elements of an array in ascending order
 * 	Display the sorted array
 * 
 * user input for reading ith element till where we want to sort in descending order
 * Sort the elements till ith element in descending order and print remaining elements as it is
 * 
 */
public class SortArray {

	static Scanner scan = new Scanner(System.in);
	private static int n; 


	public static int[] sortArray(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < (arr.length - i); j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	public static int[] sortArrayD(int[] arr,int k) {
		int temp;
		for (int i = 0; i <k; i++) {
			for (int j = 1; j < (k - i); j++) {
				if (arr[j - 1] < arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		System.out.println("Enter the no of elements in the array");
		n = scan.nextInt();
		int a[] = new int[n];
		System.out.println("Enter Array Elements:");
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();

		}
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");

		}
		System.out.println();
		a = sortArray(a);
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");

		}
		System.out.println("\nEnter the element");
		int number=scan.nextInt();
		a=sortArrayD(a,number);
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");

		}
	}

}
