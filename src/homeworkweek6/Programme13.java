package homeworkweek6;

import java.util.Scanner;

/**
 * Java program that takes three numbers as input to calculate and
 * print the average of the numbers
 * average = sum of values/numbers of values
 */
public class Programme13 {

    //main method
    public static void main(String[] args) {
        //creating scanner
        Scanner obj = new Scanner(System.in);

        //taking numbers
        System.out.println("Enter 1st Number ");
        int a = obj.nextInt();
        System.out.println("Enter 2nd Number ");
        int b = obj.nextInt();
        System.out.println("Enter 3rd Number");
        int c = obj.nextInt();

        //calling method
        average(a, b, c);

        //closing scanner
        obj.close();
    }

    //static method
    public static void average(int d, int e, int f) {
        double g = (d + e + f) / (float) 3;
        System.out.println("Average of given number is : " + g);
    }
}
