public class Loops {
    public static void main(String[] args) {

        // 1️⃣ For Loop - Repeats a block of code a fixed number of times
        System.out.println("👉 For Loop Example:");
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hello! This is message #" + i);
        }

        System.out.println("\n👉 While Loop Example:");
        // 2️⃣ While Loop - Repeats as long as the condition is true
        int i = 0;  // Initialization
        while (i < 5) {
            System.out.println("Hi! Count: " + i);
            i++;  // Increment to avoid infinite loop
        }

        System.out.println("\n👉 Do-While Loop Example:");
        // 3️⃣ Do-While Loop - Executes at least once, then checks the condition
        i = 0;  // Resetting i for do-while loop
        do {
            System.out.println("This will run at least once. Count: " + i);
            i++;
        } while (i < 5);

        System.out.println("\n👉 For-Each Loop Example:");
        // 4️⃣ For-Each Loop - Used to iterate through arrays or collections
        int[] arr = {1, 2, 3, 4, 5};  // Array of integers
        for (int e : arr) {
            System.out.println("Array Element: " + e);
        }

        // Program ends here
        System.out.println("\n✅ Program Completed Successfully!");
    }
}
