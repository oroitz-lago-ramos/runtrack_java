package jour04.Job06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        long startTime = System.currentTimeMillis();

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        System.out.println("The total sum is: " + sum);
        System.out.println("Execution time: " + executionTime + " ms");

        scanner.close();
    }
}