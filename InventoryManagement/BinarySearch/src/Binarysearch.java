import java.util.Scanner;

public class Binarysearch {
	static Scanner sc=new Scanner(System.in);
	static int size;
	static boolean flag;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str=null;
		String[] sorted = null;
		flag=true;
		do {
			display();
			int option=sc.nextInt();
			switch(option)
	        {
	        case 1:
	        {
	        	    System.out.println("Enter the number of elements to be added");		
	    		    size=sc.nextInt();
					str=addElements(size);
					break;
	        }
	        case 2:
	        {
	        	if (size == 0) {
					System.out.println("Choose the 1st Option and then continue with the rest");
					break;
				} else
					sorted=arraySort(str);
	        	displaySorted(sorted);
	        	break;
	        }
	        case 3:
	        {
	        	
				if (size == 0) {
					System.out.println("Choose the 1st Option and then continue with the rest");
					break;
				} else
				binarySearch(str);
	        	break;
	        }
	        case 4:
	        {
	        	flag=false;
	        	break;
	        }
	        }
		}while(flag);
		
	}

private static void display() {
	// TODO Auto-generated method stub
	System.out.println("-------Binary Search-------");
	System.out.println("Enter 1). To add the element");
	System.out.println("Enter 2). To sort the element");		
	System.out.println("Enter 3). Enter the element to be searched");
}

private static void binarySearch(String[] sorted) {
	// TODO Auto-generated method stub
	System.out.println("Enter the element to be searched");
	String search=sc.next();
	int result = search(sorted,search);
	if(result == -1)
	System.out.println("NO");
	else
    System.out.println("Yes");
}

private static int search(String[] sorted, String search) {
	// TODO Auto-generated method stub
	int first=0;
	int last=sorted.length-1;
	while(first <= last)
	{
		int mid=first + (last - 1)/2;
		int result=search.compareTo(sorted[mid]);
		if(result == 0)
		{
			return mid;
		}
		if(result > 0)
		{
			first=mid+1;
			
		}
		else
			last=mid-1;
		
	}
	return -1;
	
}

private static String[] arraySort(String[] str) {
	// TODO Auto-generated method stub
	int index;
	String small;
	for(int i=0;i<str.length-1;i++)
	{
		index=i;
		for(int j=i+1;j<str.length;j++)
		{
			if(str[index].compareTo(str[j])>0)
			{
				small=str[index];
				str[index]=str[j];
				str[j]=small;
			}
		}
	}
	return str;
}

private static void displaySorted(String[] str) {
	// TODO Auto-generated method stub
	for(int i=0;i<str.length;i++)
	{
		System.out.println(str[i]+ " ");
	}
}

private static String[] addElements(int size) {
	// TODO Auto-generated method stub
	String[] str1=new String[size];
	for(int i=0;i<size;i++)
	{
		str1[i]=sc.next();
	}
	return str1;
}
}

