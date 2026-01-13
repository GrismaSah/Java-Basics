import java.util.*;

public class conditional {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // program to identify the age group of people
        System.out.println("enter the age");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("adult: drive, vote");
        }
        if (age > 13 && age < 18) {
            System.out.println("teenager");
        }

        else {
            System.out.println("not adult");
        }

        // program for checking the largest of 2 (A and B )
        System.out.println("enter the first number");
        int A = sc.nextInt();
        System.out.println("enter the second number");
        int B = sc.nextInt();

        if (A >= B) {
            System.out.println("A is the largest of 2");

        } else {
            System.out.println(" B is the largest of 2");
        }

        // program if a numbr is odd or even
        System.out.println("enter the number");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println(" the number is even");

        } else {
            System.out.println("the number is odd");
        }

        // program else if
        int age = 18;
        if (age >= 18) {
            System.out.println("adult: drive, vote");
        } else if (age > 13 && age < 18) {
            System.out.println("teenager");
        }

        else {
            System.out.println("not adult");
        }

        // program for income tax calculator
        System.out.println("enter your income");
        int income = sc.nextInt();
        int tax;
        if (income < 500000) {
            tax = 0;
        } else if (income >= 500000 && income < 1000000) {
            tax = (income * 20 / 100);
        } else {
            tax = income * 30 / 100;
        }
        System.out.println("tax = " + tax);

        // program to print the largest of 3
        System.out.println("enter the first number A");
        int A = sc.nextInt();
        System.out.println("enter the second number B");
        int B = sc.nextInt();
        System.out.println("enter the third number C");
        int C = sc.nextInt();

        if (A >= B && C > A) {
            System.out.println("larger is A");

        } else if (B >= C) {
            System.out.println("larger is B");

        } else {
            System.out.println(" larger is C");
        }

        // program for ternary operator
        int number = 4;
        String type = (number % 2 == 0) ? "even" : "odd";
        System.out.println(type);

        // program for checking if a student will pass or fail
        System.out.println("enter the marks of student");
        int marks = sc.nextInt();
        if (marks >= 40) {
            System.out.println("pass");

        } else {
            System.out.println("Fail");
        }
        // using ternay opreator
        System.out.println("enter the marks of student");
        int marks = sc.nextInt();
        String Result = (marks >= 40) ? "pass" : "Fail";
        System.out.println(Result);

        // program for switch statement**
        System.out.println("enter the number");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("samosa");
                break;
            case 2:
                System.out.println("burger");
                break;
            case 3:
                break;
            default:
                System.err.println("we woke up");
        }

        // program for making calculator
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("enter the operator ");
        char op = sc.next().charAt(0);
        System.out.println("enter the second number");
        int b = sc.nextInt();

        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a % b);
                break;
            default:
                System.out.println("wrong operator");

        }

    }

}