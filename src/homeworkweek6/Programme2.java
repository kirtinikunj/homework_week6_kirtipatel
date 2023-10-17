package homeworkweek6;

/**
 * Write a Java programme using the following steps
 * declare static method
 * two static variables
 * call  into main method
 */
public class Programme2 {
    //static variables
    static int a = 2;
    static String name = "Static Method";

    //main method
    public static void main(String[] args) {
        //we can call directly because static to main(static)
        staticMethod();
    }

    //static method
    public static void staticMethod() {
        //we can call directly because static to static
        System.out.println(a);
        System.out.println(name);
        //or we can call by classname because it is static to static
        System.out.println(Programme2.a);
        System.out.println(Programme2.name);
    }
}
