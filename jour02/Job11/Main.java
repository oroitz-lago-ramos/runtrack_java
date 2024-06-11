package jour02.Job11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez la hauteur du triangle:");
        int h = scanner.nextInt();
        scanner.close();

        if (h == 0)
        {
            System.out.println("Hauteur invalide");
        }

        for (int i = 0; i < h; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
