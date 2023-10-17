package homeworkweek6;

import java.util.Scanner;

/**
 * program to calculate the area of a triangle
 * area = (1/2) · b · h
 */
public class Programme8 {

    //main method
    public static void main(String[] args) {

        //creation scanner
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter base of Triangle ");
        int a = obj.nextInt();
        System.out.println("Enter height of Triangle ");
        int b = obj.nextInt();

        //calling method
        area(a, b);

        //closing scanner
        obj.close();
    }

    //static method
    public static void area(int c, int d) {
        double e = c * d * 0.5;
        System.out.println("Aera of Triangle is : " + e);
    }
}
