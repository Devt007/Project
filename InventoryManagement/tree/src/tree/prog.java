package tree;

import java.util.*;

public class prog {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	    int[] id= {1,2,3,4};
	    String[] name= {"a","b","c","d"};
	    int[] age= {50,30,28,48};
	    
	    int[] Quantity= {1,2,3,4};
	    String[] med_name= {"med1","med2","med3","med4"};
	    int[] price= {100,200,300,400};
	    
	    System.out.println("Billing");
	    System.out.println("id = "+id[0]);
	    System.out.println("name = "+name[0]);
	    System.out.println("age = "+age[0]);
	    System.out.println("Quantity = "+Quantity[0]);
	    System.out.println("Medicine Name = "+med_name[0]);
	    System.out.println("senior citizen -- enter y/n");
	    String c=sc.next();
	    if(c == "y")
	    {
	    	System.out.println("Price ="+ price[0]*(5/100));
	    }
	    else
	    	System.out.println("Price = "+price[0]);

	    
	    
	}

}
