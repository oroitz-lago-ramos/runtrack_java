package jour02.Job05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez votre age svp:");
        int age = scanner.nextInt();
        scanner.close();

        if (age < 16)
        {
            System.out.println("Vous ne pouvez pas travailler, vous etes trop jeune");
        }
        else if (age >= 65)
        {
            System.out.println("Vous ne pouvez pas travailler, vous etes à la retraite");
        }
        else if (age > 55) 
        {
            System.out.println("Vous pouvez travailler mais il vous sera difficile trouver un emploi");
        }
        else 
        {
            System.out.println("Vous pouvez travailler");
        }
    }
}
