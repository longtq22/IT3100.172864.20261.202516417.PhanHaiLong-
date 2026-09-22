import java.util.Arrays;
import java.util.Scanner;

public class SortCostArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want to enter array elements from keyboard? (y/n): ");
        String choice = scanner.nextLine().trim();

        double[] myArr;

        if (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter number of elements: ");
            int n = scanner.nextInt();
            myArr = new double[n];
            System.out.println("Enter " + n + " numeric values:");
            for (int i = 0; i < n; i++) {
                myArr[i] = scanner.nextDouble();
            }
        } else {
            myArr = new double[] { 1789, 2035, 1899, 1456, 2013 };
            System.out.println("Using default constant array: " + Arrays.toString(myArr));
        }

        double sum = 0;
        for (double num : myArr) {
            sum += num;
        }

        Arrays.sort(myArr);

        double average = sum / myArr.length;

        System.out.println("\n--- Results ---");
        System.out.println("Sorted array: " + Arrays.toString(myArr));
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);

        scanner.close();
    }
}