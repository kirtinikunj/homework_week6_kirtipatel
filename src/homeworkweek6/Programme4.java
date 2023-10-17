package homeworkweek6;

/**
 * Write a Java programme using the following steps
 * two instance variables, one instance method
 * two static variables, one static method
 * call all of them into main method
 */
public class Programme4 {

    //instance variables
    int a = 4;
    String name = "Instance Variable";

    //static variables
    static int b = 4;
    static String name1 = "Static Variable";

    //instance method
    public void instanceMethod() {
        //directly because instance to instance
        System.out.println(a);
        System.out.println(name);
    }

    //static method
    public static void staticMethod() {
        //directly because static to static
        System.out.println(b);
        System.out.println(name1);
    }

    //main method
    public static void main(String[] args) {
        //calling instance method by creating object because instance to main
        Programme4 obj = new Programme4();
        obj.instanceMethod();

        //calling static method directly because static to main
        staticMethod();
    }
}
