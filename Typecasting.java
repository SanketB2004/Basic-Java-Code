public class Typecasting {
    /**
 * Demonstrates different types of type casting in Java:
 * 1. Automatic (widening) casting
 * 2. Manual (narrowing) casting
 * 3. Primitive to non-primitive conversion
 * 4. Non-primitive to primitive conversion
 */
public class TypeCastingDemo {

    /**
     * The main method to demonstrate type casting examples.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        System.out.println("Type Casting in Java");

        // 1. Automatic (Widening) Casting: float → double
        float fvar = 35.45f;
        double dvar = fvar;
        System.out.println("Automatic Casting (float to double): " + dvar);

        // 2. Manual (Narrowing) Casting: float → long
        long lvar = (long) fvar;
        System.out.println("Manual Casting (float to long): " + lvar);

        // 3. Primitive to Non-Primitive (int → String)
        int a = 2;
        String str = String.valueOf(a);
        System.out.println("Primitive to Non-Primitive (int to String): " + str + str);
        System.out.println("Original int addition: " + (a + a));

        // 4. Non-Primitive to Primitive (String → int)
        String b = "2";
        int num = Integer.parseInt(b);
        System.out.println("Non-Primitive to Primitive (String to int): " + num);
        System.out.println("Integer addition: " + (num + num));
    }
}
}