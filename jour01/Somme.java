package jour01;

public class Somme {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide exactly two numbers.");
            return;
        }

        double num1, num2;

        try {
            num1 = Double.parseDouble(args[0]);
            num2 = Double.parseDouble(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please provide two valid numbers.");
            return;
        }

        double sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum + ".");
    }
}
