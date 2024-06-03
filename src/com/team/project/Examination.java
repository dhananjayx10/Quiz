package com.team.project;

import java.util.Scanner;

public class Examination {

	public static void main(String[] args) {
		Examination obj = new Examination();
		obj.stuDetails();
		obj.examQuestions();
	}

	// login method
	public void stuDetails() {
		System.out.println("login");
		int Stu_id;
		String Stu_FirstName;
		String Stu_LastName;
		String Username;
		String Password;
		String City;
		String Mobile_num;
		String Stu_Mailid;

		public static void main(String[] args) {
			Demo5 demo = new Demo5();
	        System.out.println("What would you like to do?");
	        System.out.println("1. Display Personal Details");
	        System.out.println("2. Dispaly login details");
	        boolean next = true;
			while (next) {
				Scanner sc = new Scanner(System.in);
					System.out.println("Enter your choice: ");
					int choice = sc.nextInt();
					switch (choice) {
					case 1:
						demo.PersoanlDetails();
						break;
					case 2:
						demo.login_Details();
						break;
					}
					System.out.println("****************************");
					System.out.println("Enter 1 for continue or 0 for exit");
					Scanner sc1 = new Scanner(System.in);
					int input = sc1.nextInt();
					if (input == 1) {
						next= true;
					}else {
						System.out.print("Thank You!!!!");
					}
					
			}
			
		}
		public void PersoanlDetails() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Stu_id :");
			int Stu_id= sc.nextInt();
			System.out.println("Enter First Name :");
			String Stu_FirstName=sc.next();
			System.out.println("Enter Last Name :");
			String Stu_LastName=sc.next();
			System.out.println("Enter Username :");
			String Username=sc.next();
			System.out.println("Enter Password :");
			String Password=sc.next();
			System.out.println("Enter City :");
			String City=sc.next();
			System.out.println("Enter Mobile Number :");
			String Mobile_num=sc.next();
			System.out.println("Enter Mail Id :");
			String Stu_Mailid=sc.next();
			System.out.println("Registration is done.");
		}
		public void login_Details() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter UserName: ");
			String Username=sc.next();
			System.out.println("Enter Password :");
			String Password=sc.next();
		}
	}

	// -------------------------------------

	// question method
	public void examQuestions() {
		System.out.println("question");

	}
}