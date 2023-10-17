package homeworkweek6;

/**
 * Write a Java programme using the following steps
 * one instance variable
 * one static variable
 * one instance method
 * one static method
 * call all them in main method
 */
public class Programme3 {
    //instance variable
    int a = 3;
    //static variable
    static String name = "Programme 3";

    //instance method
    public void instanceMethod() {
        //we can call direct because instance to instance
        System.out.println(a);
        System.out.println(name);
        //OR we can call by creating object
        Programme3 p3 = new Programme3();
        System.out.println(p3.a);
        System.out.println(p3.name);
    }

    //static method
    public static void staticMethod() {
        //we can call directly because static to static
        System.out.println(name);
        //OR we can call by classname because static to static
        System.out.println(Programme3.name);
        //creating object to call instance variable to static mrthod
        Programme3 p1 = new Programme3();
        System.out.println(p1.a);
    }

    //main method
    public static void main(String[] args) {
        //creating object because insatnce to static
        Programme3 obj = new Programme3();
        obj.instanceMethod();

        //calling static method
        staticMethod();
    }
}
