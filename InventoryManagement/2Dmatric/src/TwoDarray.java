import java.util.Scanner;

//1 create a function that calculate unique element 
//2 Find maximum element in a matrix 
//3 Take 1-D array of  (maximum + 1) size 
//4 In for loop print the unique array

class TwoDArray
{ 
  static Scanner sc=new Scanner(System.in);
// Driver Code 
public static void main(String args[]) 
{ 
	
	System.out.println("Enter the number of rows and column :");
	int r=sc.nextInt();
	int c=sc.nextInt();
    int[][] array=creationofTwoDarray(r,c);
    displaySwappedArray(array,r,c);
}

private static void displaySwappedArray(int[][] array, int r, int c) {
	// TODO Auto-generated method stub
	int min=array[0][0];
	int max=array[r-1][c-1];
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			if(i==0 && j==0)
			{
				array[0][0]=max;
				System.out.print(array[0][0]+" ");
			}
			if(i==(r-1) && j==(c-1))
			{
				array[r-1][c-1]=min;
				System.out.print(array[r-1][c-1]+" ");
			}
			else
				if(!(i==0 && j==0))
			System.out.print(array[i][j]+" ");
		}
		System.out.println();
	}
}

private static int[][] creationofTwoDarray(int r, int c) {
	// TODO Auto-generated method stub
	int arr[][]=new int[r][c];
	int count=0;
	boolean flag=true;
	while(flag) {
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
	   int len=arr.length;
	   int len2=arr[0].length;
	   int length=len*len2;
	   count= unique(arr, r, c);   
	   if(count==length)
	   {
		   flag=false;
	   }
	   else
		   System.out.println("The entered elements is not unique----Please enter the unique element");
	}
	return arr;
} 
	static int unique(int mat[][], int n, int m) {
		int maximum = 0, count=0;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++) {
				if (maximum < mat[i][j])
				{
					maximum = mat[i][j];
				}
			}
		int b[] = new int[maximum + 1];
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				b[mat[i][j]]++;
			}
		}
		for (int i = 1; i <= maximum; i++)
		{
			if (b[i] == 1)
				++count;
		}
		return count;
	}
}