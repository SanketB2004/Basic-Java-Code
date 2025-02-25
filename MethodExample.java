import java.util.Scanner;

public class MethodExample {

    // 1. Non-Return Type Without Parameter
    static void greet() {
        System.out.println("👋 Hello! Welcome to Java Methods.");
    }

    // 2. Non-Return Type With Parameter
    static void displayMessage(String message) {
        System.out.println("📩 Your message: " + message);
    }

    // 3. Return Type Without Parameter
    static String getGreeting() {
        return "🌸 Have a great day!";
    }

    // 4. Return Type With Parameter
    static String personalizedGreeting(String name) {
        return "🤝 Hello, " + name + "! Welcome to our program.";
    }

    // 5. Addition Example (Return Type with Parameters)
    static int add(int a, int b) {
        return a + b;
    }

    // 6. Multiplication Example (Return Type with Parameters)
    static int multiply(int a, int b) {
        return a * b;
    }

    // 7. Array Example (For Each Loop)
    static void displayArray(int[] arr) {
        System.out.println("📊 Array Elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 🟢 1. Non-Return Without Parameter
        greet();

        // 🔵 2. Non-Return With Parameter
        displayMessage("Learning Java is fun!");

        // 🟣 3. Return Without Parameter
        String greeting = getGreeting();
        System.out.println(greeting);

        // 🟠 4. Return With Parameter
        System.out.print("\nEnter your name: ");
        String userName = input.nextLine();
        System.out.println(personalizedGreeting(userName));

        // ✨ 5. Addition Example
        System.out.print("\nEnter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        int sum = add(num1, num2);
        System.out.println("➕ Addition: " + sum);

        // 🚀 6. Multiplication Example
        int product = multiply(num1, num2);
        System.out.println("✖️ Multiplication: " + product);

        // 📊 7. Array Example
        int[] numbers = {10, 20, 30, 40, 50};
        displayArray(numbers);

        // 🎁 8. Exit Message
        System.out.println("\n✅ Program completed! Thank you.");
        input.close();
    }
}
