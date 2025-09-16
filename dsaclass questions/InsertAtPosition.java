import java.util.Arrays;
import java.util.Scanner;

public class InsertAtPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] originalArray = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            originalArray[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to insert: ");
        int elementToInsert = scanner.nextInt();

        System.out.print("Enter the position to insert (0 to " + size + "): ");
        int position = scanner.nextInt();

        if (position < 0 || position > size) {
            System.out.println("Invalid position!");
            scanner.close();
            return;
        }

        int[] newArray = new int[size + 1];

        for (int i = 0; i < position; i++) {
            newArray[i] = originalArray[i];
        }

        newArray[position] = elementToInsert;

        for (int i = position; i < size; i++) {
            newArray[i + 1] = originalArray[i];
        }

        System.out.println("New array: " + Arrays.toString(newArray));
        scanner.close();
    }
}
