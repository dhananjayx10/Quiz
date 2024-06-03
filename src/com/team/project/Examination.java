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
	}

	// -------------------------------------

	// question method
	public void examQuestions() {
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		
		System.out.println("Welcome to the Quiz!!");
		System.out.println("Please select the correct option(A, B, C, D) for each question.");
		
		//Question options, and correct answers array 
		String[] questions = {
				"1. Who invented Java Programming?\nA. Guido van Rassum\nB. James Gosling\nC. Dennis Ritchie\nD. Bjarne stroustrup",
				"2. Which component is used to compile,debug and execute the java programs?\nA. JRE\nB. JIT\nC. JDK\n.D JVM",
				"3. which one of the following is not a java feature?\nA. Object-orinted\nB. Use of pointers\nC. Portable\nD. Dynamic and Extensible",
				"4. Which of these cannot be used for a variable name in Java?\nA. identifier and keyword\nB. identifier\nC. keyword\nD. none of the mentiioned",
				"5. Which of these keywords are used for the block to be examined for exceptions?\nA. check\nB. throw\nC. catch\nD. try",
				"6. Which of the below is not a java Profiler?\nA. Jprofiler\nB. Eclipse Profiler\nC. JVM\nD. JConsole",
				"7. Which of the following is not an OOPS concept?\nA. Polymorphism\nB. Encapsulation\nC. Inheritance\nD. Compitation", 
				"8. Which of these are selection statements in java?\nA. break\nB. continue\nC. for()\nD. if()",
				"9. Which of these keywords is used to define interfaces in java?\nA. intf\nB. Intf\nC. interface\nD. Interface",
			    "10.Which of the following is a superclass of every java class?\nA. ArrayList\nB. Abstract class\nC. Object class\nD. String"
							
		};
		char[] correctAnswers = {'B', 'C', 'C', 'C', 'D', 'C', 'D', 'D', 'C', 'C'};
		
		//Asking questions
		for (int i = 0; i < questions.length; i++) {
			System.out.println(questions[i]);
			char input = scanner.nextLine().toUpperCase().charAt(0);
			
			if (input == correctAnswers[i]) {
				score++;
				
			}
		}
		
		//calculate grade
		double percentage = (double) score / questions.length * 100;
		char grade;
		if (percentage >= 90) {
			grade = 'A';
		} else if (percentage >= 80) {
			grade = 'B';
		}else if (percentage >= 70) {
			grade = 'C';
		}else if (percentage >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		//Output score and grade
		System.out.println("Your score: " + score + "/" +questions.length);
		System.out.println("Your grade: " + grade);
		
		scanner.close();
		System.out.println("question");

	}
}