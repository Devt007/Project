//Take two input alphanumeric strings from the user
//Then segregate the strings into two separate strings with numbers in 
//1st string and characters in 2nd string removing duplicates. 

import java.util.Scanner;

public class StringNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Alphanumeric String");
		String str1=sc.next();
		String str2=sc.next();
		String s1="";
		String s2="";
		int len1=str1.length();
		int len2=str2.length();
		for(int i=0;i<len1;i++)
		{
			if(str1.charAt(i)>='A' && str1.charAt(i)<='Z' || str1.charAt(i)>='a' && str1.charAt(i) <= 'z')
			{
				 s1=s1+str1.charAt(i);
			}
			else
			{
			     s2=s2+str1.charAt(i);
			}
		}
		for(int i=0;i<len2;i++)
		{
			if(str2.charAt(i)>='A' && str2.charAt(i)<='Z' || str2.charAt(i)>='a' && str2.charAt(i) <= 'z')
			{
				 s1=s1+str2.charAt(i);
			}
			else
			{
			     s2=s2+str2.charAt(i);
			}
		}
		 System.out.println(s1);
		 System.out.println(s2);
	}
}
