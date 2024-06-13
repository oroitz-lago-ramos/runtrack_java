package jour03.Job06;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] monTableau = new int[10];
        for (int i = 0; i < monTableau.length; i++) {
            monTableau[i] = rand.nextInt(100); // Génère un nombre aléatoire entre 0 et 99
        }
        for (int num : monTableau) {
            System.out.println(num);
        }
    }
}