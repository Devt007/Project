//Write a menu driven program to implement a solution to manage student mentors in the school with following 
//
//options: 
//
//1. Create student record	 
//
//		a. Every student has following details: id, name, age, standard (i.e., class) and address 
//
//2. Update student details 
//
//		a. This option should allow user to update either one of following details: address and age 
//
//3. Delete user details 
//
//		a. This option to delete student details from the record 
//
//4. Display user details 
//
//		a. Display student details based on ID 
//
//		b. Display student details based on Name 
//
//		d. Display user sorted based on standard 
//
//5. Exit

import java.util.Scanner;

public class MentorsApp {
	static Scanner sc = new Scanner(System.in);
	static int size;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		Student studentArray[] = null;
		do {
			System.out.println("Please Enter the options below ");
			System.out.println("1. Create student record ");
			System.out.println("2. Update student details ");
			System.out.println("3. Delete user details ");
			System.out.println("4. Display user details ");
			System.out.println("5. Exit");
			byte option = sc.nextByte();

			switch (option) {
			case 1: {
				System.out.println("Enter the number of Students");
				size = sc.nextInt();
				studentArray = createStudents(size);
				break;
			}
			
			case 2: {
				if (size == 0) {
					System.out.println("Error");
					System.out.println("Enter the 1st option and continue ");
					break;
				} else {
					UpdateAddressAge(studentArray);
					break;
				}
			}
			case 3: {
				if (size == 0) {
					System.out.println("Error");
					System.out.println("Enter the 1st option and continue");
					break;
				} else {
					deleteStudents(studentArray);
					break;
				}
			}
			case 4: {
				if (size == 0) {
					System.out.println("Error");
					System.out.println("Enter the 1st option and continue");
					break;
				} else {
					displayParticularId(studentArray);
					displayParticularName(studentArray);
					displayParticularStandard(studentArray);
					break;
				}
			}
			case 5:
				flag = false;
				break;
			}
		} while (flag);
	}

	
	private static void deleteStudents(Student[] delete) {
		// TODO Auto-generated method stub
		Student[] delete2=new Student[delete.length-1];
		System.out.println("Enter the Studentid to delete his/her details :");
		int id=sc.nextInt();
		sc.nextLine();
		for (int i = 0, k = 0; i < delete.length; i++) { 
		
			if (delete[i].getId() == id) { 
				continue; 
			}                                   
			
			delete2[k++] = delete[i]; 
		} 


		displayArray(delete2);
}

	private static void displayArray(Student[] studentArray) {
		// TODO Auto-generated method stub
		for(int i=0;i<studentArray.length;i++)
		{
			System.out.println(studentArray[i].getId()+" "+studentArray[i].getName()+
					" "+studentArray[i].getAddress()+" "+studentArray[i].getAge());

		}
		System.out.println("-----------------------------");

	}
	
	private static void displayParticularId(Student[] studentArray) {
		// TODO Auto-generated method stub
		Student arr[] = studentArray;
		System.out.println("Sorted Based On Id's");
		for (int i = 0; i < arr.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < arr.length; j++){  
	                if (arr[j].getId()<arr[index].getId()){  
	                    index = j;//searching for lowest index  
	                }  
	            }  
	            Student smallerNumber = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = smallerNumber; 
	        }
		 displayArray(arr);
	}
	
	private static void displayParticularName(Student[] studentArray) {
		// TODO Auto-generated method stub
		Student arr[] = studentArray;
		System.out.println("Sorted Based On Names");
		for (int i = 0; i < arr.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < arr.length; j++){  
	                if ((arr[index].getName().compareTo(arr[j].getName()))>0){  
	                    index = j;//searching for lowest index  
	                }  
	            }  
	            Student smallerNumber = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = smallerNumber; 
	        }
		 displayArray(arr);

	}
	
	private static void displayParticularStandard(Student[] studentArray) {
		// TODO Auto-generated method stub
		Student arr[] = studentArray;
		System.out.println("Sorted Based On Standard or Class ");

		for (int i = 0; i < arr.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < arr.length; j++){  
	                if (Integer.compare(arr[index].getStandard(), arr[j].getStandard())>0){  
	                    index = j;//searching for lowest index  
	                }  
	            }  
	            Student smallerNumber = arr[index];   
	            arr[index] = arr[i];  
	            arr[i] = smallerNumber; 
	        }
		 displayArray(arr);

	}

	private static void UpdateAddressAge(Student[] studentArray) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Id of the student to update the address and age :");
		int id = sc.nextInt();
		System.out.println("Enter the age of student : ");
		int age = sc.nextInt();
		System.out.println("Enter the address : ");
		String address = sc.next();
		for (int i = 0; i < studentArray.length; i++) {
			if ((Integer.compare(studentArray[i].getId(), id)) == 0) {
				studentArray[i].setAddres(address);
				studentArray[i].setAge(age);
				System.out.println(studentArray[i].getId()+" "+studentArray[i].getName()+" "+studentArray[i].getAddress()+" "+studentArray[i].getAge());
			}
		}

	}

	private static Student[] createStudents(int size) {
		// TODO Auto-generated method stub
		Student array[] = new Student[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the Student Id : ");
			int id = sc.nextInt();
			System.out.println("Enter the students name : ");
			String name = sc.next();
			System.out.println("Enter the class of student : ");
			int standard = sc.nextInt();
			System.out.println("Enter the age of student : ");
			int age = sc.nextInt();
			System.out.println("Enter the address : ");
			String address = sc.next();
			array[i] = new Student(id, name, standard, age, address);
		}

		return array;
	}

}
