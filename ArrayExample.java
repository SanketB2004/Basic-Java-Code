import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 1. One-Dimensional Array (1D)
        System.out.println("💡 1D Array Example:");
        int[] oneDArray = {10, 20, 30};
        for (int num : oneDArray) {
            System.out.println(num);
        }

        // 2. Two-Dimensional Array (2D)
        System.out.println("\n💡 2D Array Example:");
        int[][] twoDArray = {{20, 30}, {40, 50}};
        for (int[] row : twoDArray) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // 3. Three-Dimensional Array (3D)
        System.out.println("\n💡 3D Array Example:");
        int[][][] threeDArray = {{{20}, {20, 30}}};
        System.out.println(threeDArray[0][1][1]);  // Output: 30

        // 4. Dynamic 1D Array
        System.out.print("\n💡 Enter size for 1D array: ");
        int size = scan.nextInt();
        int[] dynamicArray = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            dynamicArray[i] = scan.nextInt();
        }

        System.out.println("1D Array Output:");
        for (int num : dynamicArray) {
            System.out.println(num);
        }

        // 5. Dynamic 2D Array
        System.out.print("\n💡 Enter rows for 2D array: ");
        int rows = scan.nextInt();
        System.out.print("Enter columns for 2D array: ");
        int cols = scan.nextInt();

        int[][] dynamic2DArray = new int[rows][cols];

        System.out.println("Enter elements for 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                dynamic2DArray[i][j] = scan.nextInt();
            }
        }

        System.out.println("2D Array Output:");
        for (int[] row : dynamic2DArray) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // 6. Jagged Array (Corrected)
        System.out.println("\n💡 Jagged Array Example:");
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[] {1, 2, 3};  // Row 1 → 3 elements
        jaggedArray[1] = new int[] {4, 5};     // Row 2 → 2 elements
        jaggedArray[2] = new int[] {6, 7, 8, 9}; // Row 3 → 4 elements

        // Printing Jagged Array
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        // Closing Scanner
        scan.close();
        System.out.println("\n✅ Program Completed!");
    }
}
