import java.util.Scanner;
    public class SubString {
	static Scanner sc = new Scanner(System.in);	
	
	public static void main(String[] args) {
		System.out.println("enter a sentence");
		String sentence = sc.nextLine();
		System.out.println("enter sub string");
		String subString = sc.nextLine();
		sentence = convertCase(sentence);
		subString = convertCase(subString);
		int countOfSubstring = getCountOfSubString(sentence, subString);
		System.out.println(countOfSubstring);
	}

	private static int getCountOfSubString(String sentence, String subString) {
		// TODO Auto-generated method stub
		char start = subString.charAt(0);
		int count = 0;
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.charAt(i) == start) {
				boolean flag = true;
				for (int j = 0; j < subString.length(); j++) {
					if (!(sentence.charAt(i + j) == subString.charAt(j))) {
						
						flag = false;
					}
				}
				if (flag) {
					count++;
				}
			}
		}
		return count;
}
	
	private static String convertCase(String sentence) {
		// TODO Auto-generated method stub
		String res = "";
		for (int i = 0; i < sentence.length(); i++) {
			int ascii = sentence.charAt(i);
			if (!((ascii >= 97 && ascii <= 122) || sentence.charAt(i) == ' ')) {
				ascii = ascii + 32;
				char c = (char) ascii;
				res = res + c;

			} else {
				res = res + sentence.charAt(i);
			}
		}
		return res;
	}
}
