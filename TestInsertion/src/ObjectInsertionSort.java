import java.util.Scanner;
import java.util.Random;

public class ObjectInsertionSort {

    public static void displayArray(Circle[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("\n");
    }

    public static void sortObjectArray() {
        Scanner input = new Scanner(System.in);
        int numObjects;
        Circle[] test;
        Random rand = new Random();

        System.out.print("Enter number of objects: ");
        numObjects = input.nextInt();
        input.close();

        /* Populate array with random String radii */
        test = new Circle[numObjects];
        for (int i = 0; i < test.length; i++) {
            // Generate a random String (e.g., "1", "5", "10")
            String randomRadius = String.valueOf(rand.nextInt(10));
            test[i] = new Circle(randomRadius);
        }

        System.out.println("Unsorted:");
        displayArray(test);

        Sorts.insertionSort(test); // Requires Sorts class to handle String comparisons

        System.out.println("Sorted:");
        displayArray(test);
    }

    public static void main(String[] args) {
        sortObjectArray();
    }
}