import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // 1️⃣ Integer Input
        System.out.println("Enter an integer:");
        int intValue = input.nextInt(); // Read an integer value
        System.out.println("You entered: " + intValue);

        // 2️⃣ Float Input
        System.out.println("\nEnter a float value:");
        float floatValue = input.nextFloat(); // Read a float value
        System.out.println("You entered: " + floatValue);

        input.nextLine();  // Clear buffer after numeric input

        // 3️⃣ String Input
        System.out.println("\nEnter a string:");
        String stringValue = input.nextLine(); // Read a full line string
        System.out.println("You entered: " + stringValue);

        // 4️⃣ Character Input
        System.out.println("\nEnter a character:");
        char charValue = input.next().charAt(0); // Read the first character of input
        System.out.println("You entered: " + charValue);

        // 5️⃣ Display Current Date
        Date currentDate = new Date(); // Create a Date object for current date and time
        System.out.println("\nCurrent Date: " + currentDate);

        // 6️⃣ Formatted Date using SimpleDateFormat
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String formattedDate = dateFormat.format(currentDate);
        System.out.println("Formatted Date: " + formattedDate);

        // 7️⃣ Output Formatting using printf
        System.out.printf("\nFormatted Output:\n");
        System.out.printf("Integer: %d\n", intValue);
        System.out.printf("Float: %.2f\n", floatValue);
        System.out.printf("String: %s\n", stringValue);
        System.out.printf("Character: %c\n", charValue);

        // Close the scanner to prevent resource leaks
        input.close();
    }
}
