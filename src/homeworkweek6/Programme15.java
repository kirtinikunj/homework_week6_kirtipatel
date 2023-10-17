package homeworkweek6;

import java.util.Scanner;

/**
 * Java program to swap two variables
 */
public class Programme15 {

    //main method
    public static void main(String[] args) {
        //creating scanner
        Scanner obj = new Scanner(System.in);

        //taking number
        System.out.println("Enter 1st Number");
        int a = obj.nextInt();
        System.out.println("Enter 2nd Number");
        int b = obj.nextInt();

        //calling method
        swap(a, b);

        //closing scanner
        obj.close();
    }

    //static method
    public static void swap(int c, int d) {

        //printing before swap
        System.out.println("Number Before swap a : " + c + " and b : " + d);

        //swapping number
        int e = c;
        c = d;
        d = e;
        //printing after swap
        System.out.println("Number after swap a : " + c + " and b : " + d);
    }
}
