package jour01;

import java.util.Scanner;

public class NomPrenom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first name:");
        String firstName = scanner.nextLine();

        System.out.println("Please enter your last name:");
        String lastName = scanner.nextLine();
        scanner.close();

        System.out.println("Your full name is: " + firstName + " " + lastName);
}
}
