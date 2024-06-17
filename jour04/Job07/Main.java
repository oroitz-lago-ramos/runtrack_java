package jour04.Job07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur la taille du tableau
        System.out.print("Entrez la taille du tableau : ");
        int taille = scanner.nextInt();

        // Créer le tableau et le remplir avec des nombres saisis par l'utilisateur
        int[] tableau = new int[taille];
        System.out.println("Entrez les éléments du tableau : ");
        for (int i = 0; i < taille; i++) {
            tableau[i] = scanner.nextInt();
        }

        // Créer deux threads pour calculer la somme en parallèle
        int milieu = taille / 2;
        int[] moitie1 = new int[milieu];
        int[] moitie2 = new int[taille - milieu];
        System.arraycopy(tableau, 0, moitie1, 0, milieu);
        System.arraycopy(tableau, milieu, moitie2, 0, taille - milieu);

        Sum sum1 = new Sum(moitie1);
        Sum sum2 = new Sum(moitie2);

        Thread thread1 = new Thread(sum1, "Sum the first half");
        Thread thread2 = new Thread(sum2, "Sum the second half");

        long startTime = System.currentTimeMillis();
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        long totalSum = sum1.getResult() + sum2.getResult();
        long executionTime = endTime - startTime;

        System.out.println("La somme totale est : " + totalSum);
        System.out.println("Temps d'exécution : " + executionTime + " ms");
    }
}
