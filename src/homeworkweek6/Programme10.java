package homeworkweek6;

import java.util.Scanner;

/**
 * program that takes a number as input and prints its
 * multiplication table up to 10
 */
public class Programme10 {

    //main method
    public static void main(String[] args) {

        //creating scanner
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter any Number : ");
        int a = obj.nextInt();

        //calling method
        tableMethod(a);

        //closing scanner
        obj.close();
    }

    //static method
    public static void tableMethod(int b) {
        System.out.println("Table of given Number is : ");
        for (int i = 1; i <= 10; ++i) {
            System.out.printf("%d * %d = %d \n", b, i, b * i);
        }
    }
}
