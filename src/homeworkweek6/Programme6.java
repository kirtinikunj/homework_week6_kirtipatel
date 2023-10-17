package homeworkweek6;
/**
 * a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r)
 */

import java.util.Scanner;

public class Programme6 {

    public static void main(String[] args) {
        //creating scanner
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter any radius value of circle : ");

        //assigning value from user
        int radius = obj.nextInt();
        //calling method
        areaCicle(radius);
        //closing scanner
        obj.close();
    }

    //static method
    public static void areaCicle(int rad) {
        //calculating area of circle
        double b = 3.14 * rad * rad;
        System.out.println("Area of circle using Radius Value is : " + b);
    }
}
