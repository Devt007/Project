package onedimension;

import java.util.Scanner;

public class Onedimension {
public static int i;
	public static void main(String[] args) {
		@SuppressWarnings("resource")
       	Scanner scan=new Scanner(System.in);
		int a[]=new int[4];
		System.out.println("enter the elements");
		for(int i=0;i<4;i++)
		{
		 a[i]=scan.nextInt();
		 }
		for(int i1=0;i1<=4;i1++)
		{
			System.out.println("the values are"+a[i]);
	
		}
	}

	
}