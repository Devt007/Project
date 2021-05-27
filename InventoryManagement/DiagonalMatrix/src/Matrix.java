import java.util.Scanner;

public class Matrix {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=null;
		arr=enterElements();
		display(arr);
		primarydiagonalArray(arr);
		secondarydiagonalArray(arr);
	}

	private static void secondarydiagonalArray(int[][] arr) {
		// TODO Auto-generated method stub
		System.out.println("Secondary diagonal odd number average : ");
		int odd=0;
		int j=0;
		for(int i=2;i>=0;--i)
		{
			if(arr[i][j]==1)
			{
				odd=odd + arr[i][j];
			}
		if(arr[i][j]%2!=0)
			{
				odd=odd + arr[i][j];
			}
		j++;
	}
		int odd1=odd/2;
		System.out.print(odd1);
	}

	private static void primarydiagonalArray(int[][] arr) {
		// TODO Auto-generated method stub
		System.out.print("Primary diagonal odd number average : ");
		int odd=0;
		for(int i=0;i<3;i++)
		{
			if(arr[i][i]==1)
				{
					odd=odd + arr[i][i];
				}
			if(arr[i][i]%2!=0)
				{
					odd=odd + arr[i][i];
				}
		}
		int odd1=odd/3;
		System.out.print(odd1);
	}

	private static int[][] enterElements() {
		System.out.println("Enter a 3x3 Matrix ");
		// TODO Auto-generated method stub
		int array[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				array[i][j]=sc.nextInt();
			}
		}
		return array;
	}

	private static void display(int[][] array) {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(array[i][j]+" ");
		    }
			System.out.println();
	    }
	}
}



