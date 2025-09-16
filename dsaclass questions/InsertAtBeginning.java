import java.util.Arrays;
import java.util.Scanner;

public class InsertAtBeginning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] originalArray = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            originalArray[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to insert at the beginning: ");
        int elementToInsert = scanner.nextInt();

        int[] newArray = new int[size + 1];
        newArray[0] = elementToInsert;

        for (int i = 0; i < size; i++) {
            newArray[i + 1] = originalArray[i];
        }

        System.out.println("New array: " + Arrays.toString(newArray));
        scanner.close();
    }
}
