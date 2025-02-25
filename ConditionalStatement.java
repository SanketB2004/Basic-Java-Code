import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 🎨 Example of if-else-if statement
        int money = 1000;
        if (money > 1000) {
            System.out.println("Bada Restro 🍽️");
        } else if (money > 0 && money <= 900) {
            System.out.println("Tapri Wale ☕");
        } else {
            System.out.println("Chota Restro 🥪");
        }

        // 📌 Switch case example for menu selection
        System.out.println("\nMenu:");
        System.out.println("1. Chai ☕");
        System.out.println("2. Cold Coffee 🧊");
        System.out.println("3. Coffee ☕");
        System.out.println("4. Hot Coffee 🔥");
        System.out.println("5. Milk Coffee 🥛");
        System.out.print("Enter your choice (1-5): ");

        // User input for choice
        int choice = input.nextInt();

        // Switch case to handle different choices
        switch (choice) {
            case 1:
                System.out.println("You ordered: Chai ☕");
                break;
            case 2:
                System.out.println("You ordered: Cold Coffee 🧊");
                break;
            case 3:
                System.out.println("You ordered: Coffee ☕");
                break;
            case 4:
                System.out.println("You ordered: Hot Coffee 🔥");
                break;
            case 5:
                System.out.println("You ordered: Milk Coffee 🥛");
                break;
            default:
                System.out.println("Invalid choice! Please select a valid option. ❌");
                break;
        }

        // Close the scanner to prevent resource leaks
        input.close();
    }
}

