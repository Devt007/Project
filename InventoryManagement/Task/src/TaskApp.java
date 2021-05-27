import java.util.Scanner;

//Implement a Menu driven program for Task Assigning system
//Task class should have the following
//Id : int
//Description: String  
//AssignedTo : String
//Status (Open, InProgress , Completed ) :String
// 
//1. Add Task details to the system and display all Task details present in system
//               id,desc,Assigned & status
//2. Search for an particular task by Status and display all Tasks sorted by ‘AssignedTo’ for given status
//        Example : If input for status is given as ‘Completed’, display all the tasks sorted 
//                   by AssignedTo for the status ‘Completed’ 
//3. Update the status of task for given Id and display updated Task details 
//4. Exit 
public class TaskApp {
	static int size;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task taskArray[]=null;
		boolean flag=true;
		do {
			System.out.println("Please Enter the following options");
			System.out.println("Enter 1) To add the task details");
			System.out.println("Enter 2) Search for an particular task by Status and display all Tasks sorted by ‘AssignedTo’ for given status");
			System.out.println("Enter 3) Update the status of task for given ID and update task details");
			byte option =sc.nextByte();
			
			switch(option) {
			case 1: {
				System.out.println("Enter the number of task to be added");
				size=sc.nextInt();
				taskArray = createTask(size);
				break;
			}
			case 2:{
				if(size==0){
					System.out.println("Error");
					System.out.println("-------------");
				}
				else {
					System.out.println("Enter the status to search :");
				    String stat=sc.next();
				  
				    
					
				}
			}
			}
			
		}while(true);
		
	}

	private static void taskSearch(String stat) {
		// TODO Auto-generated method stub
		for (int i = 0; i < size; i++) {
			switch (stat) {
			case "open": {

			}
			}
		}

	}

	private static Task[] createTask(int size2) {
		// TODO Auto-generated method stub
		Task detailArray[] = new Task[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the ID");
			int id = sc.nextInt();
			System.out.println("Enter the Description of the task");
			String description = sc.nextLine();
			System.out.println("Enter the Assigned Task");
			String assignedTask = sc.next();
			System.out.println("Enter the status of the task ");
			String status = sc.next();
			detailArray[i] = new Task(id, description, assignedTask, status);
		}
		return detailArray;
	}

}
