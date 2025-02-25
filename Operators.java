public class Operators {

    public static void main(String[] args) {

        // 1. Assignment Operator (=)
        int a = 2;  // Assigns value 2 to variable 'a'
        System.out.println("Assignment Operator: a = " + a);

        // 2. Arithmetic Operators (+, -, *, /, %)
        int b = 10;
        int c = 3;
        System.out.println("\nArithmetic Operators:");
        System.out.println("Addition (b + c): " + (b + c));   // 10 + 3 = 13
        System.out.println("Subtraction (b - c): " + (b - c)); // 10 - 3 = 7
        System.out.println("Multiplication (b * c): " + (b * c)); // 10 * 3 = 30
        System.out.println("Division (b / c): " + (b / c));   // 10 / 3 = 3 (integer division)
        System.out.println("Modulus (b % c): " + (b % c));    // 10 % 3 = 1 (remainder)

        // 3. Unary Operators (++, --)
        int d = 1;
        System.out.println("\nUnary Operators:");
        System.out.println("Post-increment (d++): " + (d++)); // Prints 1, then d becomes 2
        System.out.println("After Post-increment: " + d);     // d is now 2
        System.out.println("Pre-increment (++d): " + (++d));  // Increments first, then prints 3

        // 4. Relational (Comparison) Operators (>, <, ==, !=, >=, <=)
        System.out.println("\nRelational Operators:");
        System.out.println("2 > 3: " + (2 > 3));    // false
        System.out.println("2 != 3: " + (2 != 3));  // true
        System.out.println("2 == 2: " + (2 == 2));  // true
        System.out.println("2 >= 2: " + (2 >= 2));  // true

        // 5. Ternary Operator (condition ? true : false)
        int x = 5, y = 10;
        int max = (x > y) ? x : y;  // If x > y, return x; otherwise, return y
        System.out.println("\nTernary Operator:");
        System.out.println("Maximum of x and y: " + max);  // Output: 10

        // 6. Logical Operators (&&, ||, !)
        System.out.println("\nLogical Operators:");
        System.out.println("(x != y) || (x == y): " + (x != y || x == y));  // true (first condition true)

        // 7. Shift Operators (<<, >>, >>>)
        System.out.println("\nShift Operators:");
        System.out.println("5 << 2 (Left Shift): " + (5 << 2));   // 5 * 2^2 = 20
        System.out.println("5 >> 2 (Right Shift): " + (5 >> 2));  // 5 / 2^2 = 1
        System.out.println("5 >>> 2 (Unsigned Right Shift): " + (5 >>> 2)); // Same as >> for positive numbers
        System.out.println("-5 >>> 2 (Unsigned Right Shift): " + (-5 >>> 2)); // Positive result due to zero-fill

        // 8. Shorthand Operators (+=, -=, *=, /=)
        System.out.println("\nShorthand Operators:");
        int z = 5;
        z += 5;  // Equivalent to z = z + 5
        System.out.println("z += 5: " + z);  // Output: 10
    }
}
