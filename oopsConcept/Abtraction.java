
// Abstract Class
abstract class InnerAbtraction {
    public abstract void method();  // Abstract method
}

// Interface
interface InnerAbtraction_1 {
    void method();  // Interface method (default public & abstract)
}

// Subclass (Abstract class extend करत आहे आणि Interface implement करत आहे)
class SubClass extends InnerAbtraction implements InnerAbtraction_1 {
    // method() चं implementation द्यावं लागेल
    public void method() {
        System.out.println("Abstract class आणि Interface चे method Override केले");
    }
}

// Main Class
public class Abtraction {
    public static void main(String[] args) {
        SubClass obj = new SubClass();  // SubClass चे object तयार केले
        obj.method();  // method() कॉल केला
    }
}

