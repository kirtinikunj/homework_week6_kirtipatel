package homeworkweek6;

import java.util.Scanner;

/**
 * program to convert the upper case to lower case
 */
public class Programme9 {

    //main method
    public static void main(String[] args) {

        //creating scanner
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter message in upper case ");
        String name = obj.nextLine();

        //calling method
        caseMethod(name);

        //closing scanner
        obj.close();
    }

    //static method
    public static void caseMethod(String a) {
        String text = a.toLowerCase();
        System.out.println("Your message is converted in lower case : " + text);
    }
}
