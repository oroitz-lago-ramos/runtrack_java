package jour02.Job08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un numero:");
        int numero = scanner.nextInt();
        scanner.close();
        
        String numStr = String.valueOf(numero);
       
        System.out.println("La nombre comporte " + numStr.length() + " chiffres");
    }
}
