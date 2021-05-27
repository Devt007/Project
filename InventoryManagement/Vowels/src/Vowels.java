import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' ||  s.charAt(i)=='i' || s.charAt(i)=='o'|| s.charAt(i)=='u')
			{
				if(s.charAt(i+1)=='a' || s.charAt(i+1)=='e' || s.charAt(i+1)=='i' || s.charAt(i+1)=='o'|| s.charAt(i+1)=='u')
				{
					s1=s1+s.charAt(i);
					int asci=s.charAt(i+2);
						s1=s1+s.charAt(i);
						char c=s.charAt(i+2);
							c =(char)(asci+1);
							s1=s1+c;
							 i=i+2;
					continue;
				}
				s1=s1+s.charAt(i);
				int asci=s.charAt(i+1);
					char c=s.charAt(i+1);
						c =(char)(asci+1);
						s1=s1+c;
						 i=i+1;
			}
			else
				s1= s1 + s.charAt(i);
		}
		System.out.println(s1);
	}
}