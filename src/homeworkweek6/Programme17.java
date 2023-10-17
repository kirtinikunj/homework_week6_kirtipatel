package homeworkweek6;

import java.util.Scanner;

/**
 * Java program to convert a decimal number to binary number
 */
public class Programme17 {
    //main method
    public static void main(String[] args) {
        //creating scanner
        Scanner obj = new Scanner(System.in);

        //taking decimal number
        System.out.println("Enter decimal Number");
        int decimal = obj.nextInt();

        //closing scanner
        obj.close();

        int[] binary = new int[20];
        int index = 0;
        while (decimal > 0) {
            binary[index++] = decimal % 2;
            decimal /= 2;
        }
        System.out.println("Binary Number is : ");
        for (int i = index - 1; i >= 0; i--) {
            System.out.println(binary[i]);
        }
    }
}