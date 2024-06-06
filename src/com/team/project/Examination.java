package com.team.project;
import java.sql.SQLException;
import java.util.Scanner;

<<<<<<< HEAD
<<<<<<< HEAD
public class Examination {

	public static void main(String[] args) {
		Examination obj = new Examination();
		//stuDetails();
		//examQuestions();
	}

	// login 
        //stuDetails() {
		 
	}

	// -------------------------------------

	// question  
        //examQuestions() {
		 
	}
}
=======
import com.que.s.Quiz;
public class Examination extends ConnectionTest {
 
	public static void main(String[] args)throws SQLException {
		Examination examination=new Examination();
		//Student Details
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
					PersonalDetails();
					break;
				case 2:
					login_Details();
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
		   //Questions 
		   Quiz quiz = new Quiz();
	       quiz.questions();
	       quiz.result();
		}
public void stuDetails() {
		System.out.println("login");
		int Stu_id;
		String Stu_FirstName;
		String Stu_LastName;
		long Mobile_num;
		String Stu_Mailid;
		String Username;
		String Password;
		}
public static void PersonalDetails() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Stu_id :");
			int Stu_id= sc.nextInt();
			System.out.println("Enter First Name :");
			String Stu_FirstName=sc.next();
			System.out.println("Enter Last Name :");
			String Stu_LastName=sc.next();
		    System.out.println("Enter Mobile Number :");
			String Mobile_num=sc.next();
			System.out.println("Enter Mail Id :");
			String Stu_Mailid=sc.next();
			System.out.println("Enter Username :");
			String Username=sc.next();
			System.out.println("Enter Password :");
			String Password=sc.next();
			System.out.println("Registration is done.");
			Examination dbOps = new Examination();
			//registration
			dbOps.UserInput(Stu_id, Stu_FirstName, Stu_LastName, Mobile_num, Stu_Mailid, Username, Password);
		}
public static void login_Details(){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter UserName: ");
			String Username=sc.next();
			System.out.println("Enter Password :");
			String Password=sc.next();
		}
	 
}
>>>>>>> f1
=======
>>>>>>> 5a2130e5fb57a0dbf6ba89a1a4cd31dd36c39634
