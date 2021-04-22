package com.onearray;

import java.util.Scanner;

/*
 *  Take user ip for the string
 *  Read the values and store it in array 
 *  print the ip value stored in array
 *  increment the value of consonant for next value if there is an voewl and consonant
 *  if there is only vowel do nothing
 *  if there are two consecutive vowel increase by next value for the consonant
 *   
 */
public class StringReplace {
	static Scanner scan=new Scanner(System.in);
	

	public static void main(String[] args) 
	{
		System.out.println("Enter the string");
		String s=scan.nextLine();
		char arr[]=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			arr[i]=s.charAt(i);
			
		}
		for(int i=0;i<arr.length-1;i++)
		{//I am good boy
			if((arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U')&&(arr[i+1]!=' '))
			{
			if(arr[i+1]!='a'||arr[i+1]!='e'||arr[i+1]!='i'||arr[i+1]!='o'||arr[i+1]!='u'||arr[i+1]!='A'||arr[i+1]!='E'||arr[i+1]!='I'||arr[i+1]!='O'||arr[i+1]!='U')
				{
					if(arr[i+1]=='z')
						arr[i+1]='a';
					else if((arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U')&&
							(arr[i+1]=='a'||arr[i+1]=='e'||arr[i+1]=='i'||arr[i+1]=='o'||arr[i+1]=='u'||arr[i+1]=='A'||arr[i+1]=='E'||arr[i+1]=='I'||arr[i+1]=='O'||arr[i+1]=='U'))
					{
						continue;
					}
					else
					arr[i+1]=(char)(arr[i+1]+1);
				}
			}
		}
		String op ="";
		for(int i=0;i<arr.length;i++)
		{
		op+=arr[i];
		}
		System.out.println(op);
		
	    
	}

}
