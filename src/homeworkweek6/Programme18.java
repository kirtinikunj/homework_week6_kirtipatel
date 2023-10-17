package homeworkweek6;

import java.util.Scanner;

/**
 * Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers
 */
public class Programme18 {

    public static void main(String[] args) {
        //creating scanner
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter 1st Number");
        double a = obj.nextDouble();
        System.out.println("Enter 2nd Number");
        double b = obj.nextDouble();

        //calling method
        calculation(a, b);

        //closing scanner
        obj.close();
    }

    //static method
    public static void calculation(double c, double d) {
        double add = c + d;
        double mul = c * d;
        double sub = c - d;
        double div = (float) c / d;
        double mod = c % d;

        System.out.println("Addition of two Number a " + c + " and " + d + " is : " + add);
        System.out.println("Multiplication of two Number a " + c + " and " + d + " is : " + mul);
        System.out.println("Subraction of two Number a " + c + " and " + d + " is : " + sub);
        System.out.println("Division of two Number a " + c + " and " + d + " is : " + div);
        System.out.println("Modulation of two Number a " + c + " and " + d + " is : " + mod);
    }
}
