package jour04.Job04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez saisir le nombre maximum à compter: ");
        int maxCount = scanner.nextInt();

        long startTime = System.nanoTime();
        int result = 0;
        for (int i = 1; i <= maxCount; i++) {
            // System.out.println(i);
            result += 1;
        }

        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        System.out.println("Le comptage est terminé.");
        System.out.println("Temps d'exécution en nanosecondes: " + duration);
        System.out.println("Temps d'exécution en millisecondes: " + (duration / 1_000_000.0));
        System.out.println("Temps d'exécution en secondes: " + (duration / 1_000_000_000.0));
        System.out.println("Résultat: " + result);
        
        scanner.close();
    }
}
