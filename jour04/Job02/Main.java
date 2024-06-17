package jour04.Job02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la longueur de la chaîne de caractères à générer:");
        int length = scanner.nextInt();
        scanner.close();

        RandomStringGenerator generator = new RandomStringGenerator(length);
        Thread thread = new Thread(generator);

        long startTime = System.nanoTime();
        thread.start();
        try {
            thread.join(); // Wait for the thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.nanoTime();

        System.out.println("Time taken: " + (endTime - startTime) + " nano seconds.");
    }
}
