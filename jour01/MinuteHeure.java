package jour01;

import java.util.Scanner;

public class MinuteHeure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer un nombre de minutes:");
        int minutes = scanner.nextInt();
        scanner.close();
        
        int heures = minutes / 60;
        int reste = minutes % 60;

        System.out.println(minutes + " minutes correspond à " + heures + " heures et " + reste + " minutes.");
    }
}
