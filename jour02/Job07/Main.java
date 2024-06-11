package jour02.Job07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez rentrer un nombre");
        int number = scanner.nextInt();
        scanner.close();

        int iterResult =  IterativeFactorial(number);
        int recuResult = RecursiveFactorial(number);

        System.out.println("Le résultat de la factorielle par iteration du nombre " + number + " est " + iterResult);
        System.out.println("Le résultat de la factorielle par recursivité du nombre " + number + " est " + recuResult);

    }

    static int IterativeFactorial(int number)
    {
        int result = 1;
        if (number == 0)
        {
            return 0;
        }
        for (int i = 1; i <= number; i++)
        {
            result *= i;
        }
        return result;
    }

    static int RecursiveFactorial(int number)
    {
        if (number <= 1)
        {
            return number;
        }
       return number * RecursiveFactorial(number - 1 );
    }


}
