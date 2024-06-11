package jour02.Job03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        scanner.close();

        for (int i = 0; i <= 10; i++)
        {
            System.out.println(i + " x " + number + " = " + number * i);
        }
    }
}
