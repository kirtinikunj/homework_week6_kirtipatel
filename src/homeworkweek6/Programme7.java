package homeworkweek6;


import java.util.Scanner;

/**
 * a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius((F − 32) × 5/9 = 0°C).
 */
public class Programme7 {

    public static void main(String[] args) {
        //creating object
        Scanner s = new Scanner(System.in);

        System.out.println("Enter value of degree Fahrenheit ");

        //assigning value from user
        double a = s.nextInt();

        //calling method
        temprature(a);

        //closing scanner
        s.close();
    }

    public static void temprature(double b) {
        double c = (b - 32) * (float) 5 / 9;
        System.out.println("Value of Fahrenheit to Celsius is : " + c);
    }
}
