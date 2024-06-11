package jour01;

import java.util.Scanner;

public class Nombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer un nombre:");
        int nombre = scanner.nextInt();
        scanner.close();

        String result = "";
        for (int i = 1; i <= nombre; i++) {
            System.out.println(i);
            result += String.valueOf(i) + " ";
        }
        System.out.println(result);
        }
}
