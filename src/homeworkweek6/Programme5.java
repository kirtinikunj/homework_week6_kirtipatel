package homeworkweek6;

/**
 * program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */

import java.util.Scanner;

public class Programme5 {

    //1st static method
    public static void addition(int a, int b) {
        int ans = a + b;
        System.out.println("Addition of two numbers " + a + " and " + b + " is : " + ans);
    }

    //2nd static method
    public static void subtraction(int a, int b) {
        int ans = a - b;
        System.out.println("Subtraction of two numbers " + a + " and " + b + " is : " + ans);
    }

    //1st instance method
    public void multiplication(int a, int b) {
        int ans = a * b;
        System.out.println("Mutliplication of two numbers " + a + " and " + b + " is : " + ans);
    }

    //2nd instance method
    public void division(int a, int b) {
        float ans = (float) a / b;
        System.out.println("Division of two numbers " + a + " and " + b + " is : " + ans);
    }

    //main method
    public static void main(String[] args) {

        //creating scanner
        Scanner s1 = new Scanner(System.in);

        //assigning values from user
        System.out.println("Enter first Number ");
        int a = s1.nextInt();
        System.out.println("Enter second Number ");
        int b = s1.nextInt();
        //calling static methods
        addition(a, b);
        subtraction(a, b);

        //calling instance methods by creating object
        Programme5 obj = new Programme5();
        obj.multiplication(a, b);
        obj.division(a, b);

        //closing scanner
        s1.close();
    }
}
