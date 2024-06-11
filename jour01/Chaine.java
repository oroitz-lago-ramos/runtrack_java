package jour01;

import java.util.Scanner;

public class Chaine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first string:");
        String chaine1 = scanner.nextLine();

        System.out.println("Please enter the second string:");
        String chaine2 = scanner.nextLine();
        scanner.close();

        System.out.println("Before swapping:");
        System.out.println("First string: " + chaine1);
        System.out.println("Second string: " + chaine2);
                    
        chaine1 = chaine1 + chaine2;
        chaine2 = chaine1.substring(0, (chaine1.length() - chaine2.length()));
        chaine1 = chaine1.substring(chaine2.length());

        System.out.println("After swapping:");
        System.out.println("First string: " + chaine1);
        System.out.println("Second string: " + chaine2);
    }
}
