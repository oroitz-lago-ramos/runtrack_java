package jour04.Job03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la longueur de la chaîne de caractères à générer:");
        int length = scanner.nextInt();
        scanner.close();

        Object lock = new Object();
        RandomStringGenerator firstGenerator = new RandomStringGenerator(length / 2, lock);
        RandomStringGenerator secondGenerator = new RandomStringGenerator((length & 1) == 0 ? length / 2 : length / 2 + 1, lock);
        Thread firstThread = new Thread(firstGenerator);
        Thread secondThread = new Thread(secondGenerator);

        long startTime = System.nanoTime();
        firstThread.start();
        secondThread.start();
        try {
            firstThread.join(); // Wait for the thread to finish
            secondThread.join(); // Wait for the thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.nanoTime();

        System.out.println("Time taken: " + (endTime - startTime) + " nano seconds.");
    }
}
