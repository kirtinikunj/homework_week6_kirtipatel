package homeworkweek6;

/**
 * Write a Java programme using the following steps
 * Two instance variables
 * declare instance method
 * call into main method
 */
public class Programme1 {
    //instance variables
    int a = 1;
    String name = "Instance Method";

    //main method
    public static void main(String[] args) {
        //we have to create object because instance to main method
        Programme1 obj = new Programme1();
        obj.instanceMethod();
    }

    //instance method
    public void instanceMethod() {
        //we can call direct because instance to instance
        System.out.println(a);
        System.out.println(name);
        //or we can call by creating object
        Programme1 m1 = new Programme1();
        System.out.println(m1.a);
        System.out.println(m1.name);
    }
}
