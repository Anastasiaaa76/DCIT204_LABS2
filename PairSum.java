import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Interactive Pair Sum Algorithm ===");
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Create and populate the array
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Prompt user for the target sum
        System.out.print("Enter the Target Sum: ");
        int targetSum = scanner.nextInt();

        boolean pairFound = false;

        System.out.println("\n--- Searching for Pair ---");
        // Brute-force nested loops to find a unique pair
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] + numbers[j] == targetSum) {
                    System.out.println("Pair Found!");
                    System.out.println("Indices: [" + i + ", " + j + "]");
                    System.out.println("Values: " + numbers[i] + " and " + numbers[j]);
                    System.out.println("Equation: " + numbers[i] + " + " + numbers[j] + " = " + targetSum);
                    pairFound = true;
                    break; // Break outer loop if you only need the first unique pair
                }
            }
            if (pairFound) {
                break;
            }
        }

        if (!pairFound) {
            System.out.println("No unique pair exists in the array whose sum equals " + targetSum + ".");
        }

        scanner.close();
    }
}