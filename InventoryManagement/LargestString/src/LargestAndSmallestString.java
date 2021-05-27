import java.util.Scanner;

public class LargestAndSmallestString {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s2 = "";
		int n = 0;
		int k = 0;
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				count = count + 1;
			}
		}
//		for(int i=0;i<n;i++)
//		{
//			System.out.println(str[i]);
//		}
		System.out.println(count);
		String str[] = new String[count];
		for (int i = 0; i < s.length(); i++) {
			if ((n + 1) == count) {
				for (int j = k; j < s.length(); j++) {
					s2 = s2 + s.charAt(j);

				}
				if (n <= count)
					str[n] = s2;
				++n;
			}
			if (s.charAt(i) == ' ') {

				for (int j = k; j < i; j++) {
					s2 = s2 + s.charAt(j);

				}
				k = i + 1;
				if (n <= count)
					str[n] = s2;
				++n;
				s2 = "";
			}

		}
		for (int i = 0; i < str.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < str.length; j++) {
				if ((str[j].compareTo(str[index])) < 0) {
					index = j;// searching for lowest index
				}
			}
			String smallerNumber = str[index];
			str[index] = str[i];
			str[i] = smallerNumber;
		}
		System.out.println("Smallest  "+ str[0]);
		System.out.println("Largest   " +str[count - 1]);

	}

}
