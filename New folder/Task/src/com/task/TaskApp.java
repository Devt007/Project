package com.task;

import java.util.Scanner;


public class TaskApp {
 
	
	static Scanner scan=new Scanner(System.in);
	
	static Task t[];
	static int task;
	public static void main(String[] args) {
				
		
		System.out.println("Welcome to Task management system");
		int ch=0;
		do
		{
			System.out.println("Enter the Choice");
			System.out.println("1. Add Task details to the system and display all Task details present in system");
			System.out.println("2.Search for an particular task by Status and display all Tasks sorted by ‘AssignedTo’ for given status");
			System.out.println("3.Update the status of task for given Id and display updated Task details");
			System.out.println("4.Exit");
			
			ch=scan.nextInt();
			
			switch(ch)
			{
			case 1: addTaskDetails();
			break;
			
			case 2: searchStatus();
			break;
			
			case 3: updateStatus();
			break;
			
			default:
			System.exit(0);
			break;
			}
		}while(ch<5);

	}


	private static void updateStatus() {
		// TODO Auto-generated method stub
		System.out.println("Enter the task Id");
		int id=scan.nextInt();
		
		System.out.println("Enter the updated status");
		String status=scan.next();
		
		for(int i=0;i<task;i++)
		{
			if(t[i].getId()==id) {
				t[i].setStatus(status);
				System.out.println(t[i].getId()+" "+t[i].getDescription()+" "+t[i].getAssignedto()+" "+t[i].getStatus());
			}
		}
		
	}


	public static void addTaskDetails()
	{
		System.out.println("Enter the no of tasks");
		task=scan.nextInt();
		t=new Task[task];
		for(int i=0;i<task;i++)
		{
			
			System.out.println("Enter The Task Id");
			int id=scan.nextInt();
			
			System.out.println("Enter the Task Description");
			String description=scan.next();
			
			System.out.println("Enter the Task Assigned To");
			String taskassignedto = scan.next();
			
			System.out.println("Enter the task Status");
			String status=scan.next();
			
			t[i]=new Task(id,description,taskassignedto,status);
			}
		
		
	}
	
	
	private static void searchStatus()
	{
		Task tk=new Task();
	    System.out.println("Enter the Status");
		String status=scan.next();
		Task st[]=new Task[task];
		int j=0;
		for(int i=0;i<task;i++)
		{
			if(status.equals(t[i].getStatus())) {
				st[j]=t[i];
				j++;
			}
		}
	Task p[]=new Task[task];
		
		for(int i=0;i<task-i;i++)
		{
			for(j=i+1;j<task;j++)
			{
				if(st[i].getStatus().compareTo(st[j].getStatus())>0)//if(a>b)
				{
				      p[i] =st[i];//temp=a;
				      
				      st[i]=new Task(st[j].getId(),st[j].getDescription(),st[j].getAssignedto(),st[j].getStatus());//a=b;
				      st[j]=new Task(p[i].getId(),p[i].getDescription(),p[i].getAssignedto(),p[i].getStatus());//b=temp;
				}
			}
		}
		for(int i=0;i<task;i++)
		{
			System.out.println(st[i].getId()+" "+st[i].getDescription()+" "+st[i].getAssignedto()+" "+st[i].getStatus());
		}
		
	}

}
