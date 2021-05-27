import java.util.Scanner;

public class Prime 
{
	 static Scanner s=new Scanner(System.in);

	public static void main(String[] args)
	{
		int size;
		System.out.println("Enter the array size");
		size=s.nextInt();
		addElement(size);
	}

	private static void addElement(int size) {
		
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		sorted(a);
	}

	private static void sorted(int[] a) {
//		 TODO Auto-generated method stub
		int n = a.length; 
		int item,j;
        for (int i=1; i<=n-1; ++i)
        {  
           
          item=a[i];
          for(j=i-1;j>=0 && a[j]>item;--j)
          {
        		  
              	  a[j+1]=a[j];
        		
          }
          a[j+1]=item;

        }
        display(a);

	}

	private static void display(int[] a) {
	//	 TODO Auto-generated method stub
		for(int k=0;k<=a.length-1;++k)
		{
			System.out.print(a[k]+" ");
		}
		System.out.println();
        primeNumber(a);

	}

	private static void primeNumber(int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j1=1;j1<=a[i];j1++)
			{
				if(a[i]%j1==0)
				{
					count++;
				}
			}
		
			if(count==2)
			{
				System.out.print(a[i]+" ");
		    }
		}
	}
}



