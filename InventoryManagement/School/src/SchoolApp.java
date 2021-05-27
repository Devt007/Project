import java.util.Scanner;

public class SchoolApp {
	static Scanner sc = new Scanner(System.in);
	static int size;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		Student studentArray[] = null;
		do {
			System.out.println("Please Enter the options below");
			System.out.println("Enter 1. to Add Student details");
			System.out.println("Enter 2. to To sort the Students based on names");
			System.out.println("ENter 3. to Display Students with pending fees");
			System.out.println("Enter 4. to Update submitted fee for particular Student");
			System.out.println("Enter 6. to Display all students of particular class");
			System.out.println("Enter 7. to Exit");
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
					System.out.println(" ");
					break;
				} else {
					System.out.println("------------------");
					StudentSorted(studentArray);
					break;
				}
			}
			case 3: {
				if (size == 0) {
					System.out.println("Error");
					System.out.println(" ");
					break;
				} else {
					displaiPendingfee(studentArray);
				}
			}
			case 4: {
				if (size == 0) {
					System.out.println("Error");
					System.out.println(" ");
					break;
				} else {
					Updatefee(studentArray);
				}
			}
			case 6: {
				if (size == 0) {
					System.out.println("Error");
					System.out.println(" ");
					break;
				} else {
					displayParticularClass(studentArray);
				}
			}
			case 7:
				flag = false;
				break;
			}
		} while (flag);
	}

	private static void displayParticularClass(Student[] studentArray) {
		// TODO Auto-generated method stub
		Student student[] = studentArray;
		System.out.println("Enter the class ");
		int c = sc.nextInt();
		System.out.println("Students");

		for (int i = 0; i < student.length; i++) {
			if (Integer.compare(student[i].getCls(), c) == 0) {

				System.out.println(student[i].getName());
			}
		}

	}

	private static void Updatefee(Student[] studentArray) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Id of the student to update the fee");
		int id = sc.nextInt();
		System.out.println("Enter the fee to be updated");
		int fee2 = sc.nextInt();
		for(int i=0;i<studentArray.length;i++)
		{
			if((Integer.compare(studentArray[i].getId(), id))==0)
			{
				studentArray[i].setFeeSubmitted(fee2);
			}
		}

	}

	private static void displaiPendingfee(Student[] studentArray) {
		// TODO Auto-generated method stub
		Student student[] = studentArray;
		for (int i = 0; i < student.length; i++) {
			if (student[i].getTotalfee() > student[i].getFeeSubmitted()) {
				System.out.println("Pending Fee with " + student[i].getId() + " = " + student[i].getName() + " & "
						+ (student[i].getTotalfee() - student[i].getFeeSubmitted()));
			}

		}
		System.out.println("--------------");
	}

	private static void StudentSorted(Student[] studentArray) {
		// TODO Auto-generated method stub
		Student student[] = studentArray;
		for (int i = 0; i < student.length; i++) {
			for (int j = i + 1; j < size; j++) {

				if (student[i].getName().compareTo(student[j].getName()) > 0) {
					Student temp = student[i];
					student[i] = student[j];
					studentArray[j] = temp;
				}
			}
		}
		displaySortedStudent(student);

	}

	private static void displaySortedStudent(Student[] student) {
		// TODO Auto-generated method stub
		System.out.println("Sorted Array list");
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].getName() + " = " + student[i].getId());
		}
		System.out.println("-------------------");
	}

	private static Student[] createStudents(int size) {
		// TODO Auto-generated method stub
		Student array[] = new Student[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the Student Id : ");
			int id = sc.nextInt();
			System.out.println("Enter the students name : ");
			String name = sc.next();
			System.out.println("Enter the clas sof student : ");
			int cls = sc.nextInt();
			System.out.println("Enter the phone number : ");
			String phonedetails = sc.next();
			System.out.println("Enter the total fee per year : ");
			int totalfee = sc.nextInt();
			System.out.println("Enter the Fee-Submitted : ");
			int feeSubmitted = sc.nextInt();
			array[i] = new Student(id, name, cls, phonedetails, totalfee, feeSubmitted);
		}

		return array;
	}

}
