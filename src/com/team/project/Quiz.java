package com.team.project;

import java.sql.SQLException;
import java.util.Scanner;

public class Quiz {

    static int right = 0;
    static int wrong = 0;

    public void questions() {
        System.out.println("-----------quiz started------------");
        que1();
        que2();
        que3();
        que4();
        que5();
        que6();
        que7();
        que8();
        que9();
        que10();
    }

    public void que1() {
        System.out.println("Que 1 : In which of the following is toString() method defined?");
        System.out.println("     a. Java.lang.string\n     b. Java.lang.object\n     c. Java.lang.util\n     d. None");
        System.out.print("Enter your Answer : ");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        if (answer.equals("b"))
            ++right;
        else
            ++wrong;
    }

    public void que2() {
        System.out.println("Que 2 : Which company created Java?");
        System.out.println("     a. Sun Microsystems\n     b. Microsoft\n     c. Apple\n     d. IBM");
        System.out.print("Enter your Answer : ");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        if (answer.equals("a"))
            ++right;
        else
            ++wrong;
    }
    public void que3() {
        System.out.println("Que 3 : What is the correct syntax to print 'Hello, World!' in Java?");
        System.out.println("     a. System.out.println(\"Hello, World!\");\n     b. System.print(\"Hello, World!\");\n     c. print(\"Hello, World!\");\n     d. printf(\"Hello, World!\");");
        System.out.print("Enter your Answer : ");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        if (answer.equals("a"))
            ++right;
        else
            ++wrong;
    }

    public void que4() {
        System.out.println("Que 4 : How do you declare a variable to store an integer value in Java?");
        System.out.println("     a. int x;\n     b. integer x;\n     c. num x;\n     d. int = x;");
        System.out.print("Enter your Answer : ");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        if (answer.equals("a"))
            ++right;
        else
            ++wrong;
    }

    public void que5() {
        System.out.println("Que 5 : Which method is used to find the length of a string in Java?");
        System.out.println("     a. getSize()\n     b. length()\n     c. getLength()\n     d. size()");
        System.out.print("Enter your Answer : ");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        if (answer.equals("b"))
            ++right;
        else
            ++wrong;
    }

    public void que6() {
        System.out.println("Que 6 : How do you create a comment in Java?");
        System.out.println("     a. // This is a comment\n     b. /* This is a comment */\n     c. # This is a comment\n     d. % This is a comment");
        System.out.print("Enter your Answer : ");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        if (answer.equals("a"))
            ++right;
        else
            ++wrong;
    }

    public void que7() {
        System.out.println("Que 7 : How do you start a for loop in Java?");
        System.out.println("     a. for (i = 0; i < 5; i++)\n     b. for (int i = 0; i < 5; i++)\n     c. for i in range(0, 5)\n     d. foreach (int i : range(0, 5))");
        System.out.print("Enter your Answer : ");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        if (answer.equals("b"))
            ++right;
        else
            ++wrong;
    }

    public void que8() {
        System.out.println("Que 8 : Which of these is a correct method declaration in Java?");
        System.out.println("     a. public int myMethod() {}\n     b. public void myMethod {}\n     c. public void myMethod() {}\n     d. public int myMethod() []");
        System.out.print("Enter your Answer : ");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        if (answer.equals("c"))
            ++right;
        else
            ++wrong;
    }

    public void que9() {
        System.out.println("Que 9 : How do you create an object of a class in Java?");
        System.out.println("     a. ClassName object = new ClassName();\n     b. ClassName object = ClassName();\n     c. ClassName object = new ClassName;\n     d. ClassName object = ClassName;");
        System.out.print("Enter your Answer : ");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        if (answer.equals("a"))
            ++right;
        else
            ++wrong;
    }

    public void que10() {
        System.out.println("Que 10 : Which keyword is used to inherit a class in Java?");
        System.out.println("     a. extend\n     b. implements\n     c. inherits\n     d. extends");
        System.out.print("Enter your Answer : ");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        if (answer.equals("d"))
            ++right;
        else
            ++wrong;
    }


    public void result() {
        System.out.println(" Your Result Is ");
        System.out.println("    right Ans     : " + right);
        System.out.println("    wrong Ans     : " + wrong);
        int score = right * 2;
        System.out.println("    Total score   : " + score);
        System.out.print("    Your Grade    : ");
        if (score >= 17)
            System.out.println("A");
        else if (score >= 11)
            System.out.println("B");
        else if (score >= 5)
            System.out.println("C");
        else
            System.out.println("D");
        String grade = getGrade(score);
        try {
            DatabaseConnector.saveResult(score, grade);
        } catch (SQLException e) {
            System.err.println("Error saving result: " + e.getMessage());
        }
    }

    private String getGrade(int score) {
        if (score >= 17)
            return "A";
        else if (score >= 11)
            return "B";
        else if (score >= 5)
            return "C";
        else
            return "D";
    }
}
