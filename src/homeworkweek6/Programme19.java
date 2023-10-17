package homeworkweek6;

import java.util.Scanner;

/**
 * Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 */
public class Programme19 {
    //main method
    public static void main(String[] args) {
        //creating scanner
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter sentence in upper case");
        String sen = obj.nextLine();

        //calling method
        caseMethod(sen);

        //closing scanner
        obj.close();
    }

    //static method
    public static void caseMethod(String name) {
        String text = name.toLowerCase();
        System.out.println("Your sentence converted into lowercase : " + text);
    }
}
