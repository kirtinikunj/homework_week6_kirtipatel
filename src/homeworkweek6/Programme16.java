package homeworkweek6;

import java.util.Scanner;

/**
 * Java program to add two binary numbers
 */
public class Programme16 {
    //main method
    public static void main(String[] args) {
        //creating scanner
        Scanner obj = new Scanner(System.in);

        //taking two numbers
        System.out.println("Enter 1st binary number");
        String a = obj.nextLine();
        System.out.println("Enter 2nd binary number");
        String b = obj.nextLine();
        //calling method
        bianary(a, b);
        //closing scanner
        obj.close();
    }

    //static method
    public static void bianary(String c, String d) {
        int num1 = Integer.parseInt(c, 2);
        int num2 = Integer.parseInt(d, 2);
        int result = num1 + num2;
        String binaryResult = Integer.toBinaryString(result);
        System.out.println("Sum of two binary numbers is : " + binaryResult);
    }
}
