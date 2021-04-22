package com.string;

import java.util.Scanner;

public class StringOccurence {

	
	static Scanner scan=new Scanner(System.in);
	 public static String lowerCase(String str) {
		 String res = "";
		 for (int i = 0; i < str.length(); i++) {
		 char ch = str.charAt(i);
		 if (ch >= 65 && ch <= 91) {
		 res = res + (char) ((int) ch + 32);
		 } else
		 res = res + ch;

		 }
		 return res;
		 }


	 public static boolean isVowel(char ch)
	 {
		 if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' )
			 return true;
		 else
			 return false;
	 }
	 static String subString(int i, String s)
	 {
		 char ch=(char)(s.charAt(i)+1);
		 String str="";
		 for(int j=0;j<i;j++)
		 {
			 str+=s.charAt(j);
		 }
		 str+=ch;
		 for(int j=i+1;j<s.length();j++)
		 {
			 str+=s.charAt(j);
		 }
		 return str;
	 }
	public static void main(String[] args) {
		System.out.println("Enter the Input String");
		String input =scan.nextLine();
		input=lowerCase(input);
		int count=0;
		//char arr[]=new char[input.length()];
//		for(int i=0;i<input.length();i++)
//		{
//			arr[i]=input.charAt(i);
//		}
//		System.out.println("Entered string is");
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.print(arr[i]);
//		}
		System.out.println("\nenter the key:");
		String k=scan.next();
		k=lowerCase(k);
		for(int i=0;i<=input.length()-k.length();i++)
		{
			String s="";
			for(int j=0;j<k.length();j++)
			s+=input.charAt(i+j);
			if(s.equals(k))
			{
				count++;
			}
		}
		for(int i=0;i<input.length();i++)
		{
			char ch;
			if(isVowel(input.charAt(i)))
			{
				ch=(char)(input.charAt(i)+1);
				input=subString(i,input);
			}
		}
		System.out.println(input);
		System.out.println("Count:"+count);
	}

}
