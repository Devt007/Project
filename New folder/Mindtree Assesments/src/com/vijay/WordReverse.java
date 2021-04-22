 package com.vijay;

import java.util.Scanner;

/* Write a program which reads a sentence as an input and perform below changes.
step 1: First word is as it is
step 2 : last word converted to its first and last letter and also converted to capital case
step 3 : Rest all words should be replaced with next letter.

Please find the below examples

 Sample Input1: today is a good day
Sample Output1: today jt b hppe DY

 Sample Input2: India is my Country
Sample Output2: India jt nz CY

Note: No inbuilt method should be used from String other than indexOf(), charAt(), comparesTo(), equals() and length()*/

public class WordReverse {
	
	public static String firstWord(String str)
	{
		String temp="";
		for(int i=0;i<str.indexOf(' ');i++)
		{  
			temp+=str.charAt(i); 
    	  }

		return temp;
	}
	public static String UpperWord(String str)//yrtnuoc
	{
		String op="", r="";
		op+=str.charAt(str.length()-1);
		op+=str.charAt(0);//op=cy
		char ch;
		for(int i=0;i<op.length();i++) {
			if (op.charAt(i) >= 'a' && op.charAt(i) <= 'z') {
                ch = (char)(op.charAt(i) - 32);
            }
            //else keep the same alphabet or any character
            else {
                ch = (char)(op.charAt(i));
            }
			r+=ch;
		}
		return r;
	}
	public static String LastWord(String str)//str="yrtnuoc"
	{
	String b="";
	for(int i=str.length();i>0;--i)                
    {  
    b+=str.charAt(i-1);           
    }
	return b;//b=country
	}

	public static void main(String[] args) 
	
	{
      String a = "";
      
	 Scanner scan = new Scanner(System.in);
     System.out.println("Enter the Input");
      a=scan.nextLine();
      char arr[]=new char[a.length()];
      String temp= "",b="";
      int j=0;
      for(int i=0;i<a.length();i++)
      {
    	  arr[i]=a.charAt(i);
      }
      for(int i=a.length();i>0;--i)                
      {  
      b+=a.charAt(i-1);           
      } 
      String str=LastWord(firstWord(b));//country
     int n=a.indexOf(str);//12
      
      System.out.print(firstWord(a));
     
      int m=a.indexOf(' ');//5
    for(int i=m;i<n;i++)
      {    	  
    	  if(arr[i]==' ' ) {
    		  System.out.print(" ");
    	  }
    	  else {
    		 		 System.out.print((char)(arr[i]+1)); 
    	  }
    	 
      } 
          
      System.out.println(UpperWord(firstWord(b)));//CY
      
	}
}
