package homeworkweek6;

import java.util.Scanner;

/**
 * program to print the area and perimeter of a rectangle
 * area = h*w
 * perimeter = (h+w)*2
 */
public class Programme14 {

    //main method
    public static void main(String[] args) {
        //creating scanner
        Scanner obj = new Scanner(System.in);

        //taking height and width
        System.out.println("Enter Height of Rectangle ");
        double a = obj.nextDouble();
        System.out.println("Enter Width of Rectangle ");
        double b = obj.nextDouble();

        //calling method
        rectangle(a, b);

        //closing scanner
        obj.close();
    }

    //static method
    public static void rectangle(double c, double d) {
        //calculating area
        double e = c * d;
        //calculating perimeter
        double f = (c + d) * 2;

        //printing output
        System.out.println("Area of Rectangle is : " + e);
        System.out.println("Perimeter of Rectangle is : " + f);
    }
}
