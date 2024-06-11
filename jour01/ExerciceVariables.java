package jour01;

public class ExerciceVariables {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 8;

        System.out.println("La valeur de num1 est " + num1);
        System.out.println("La valeur de num2 est " + num2);

        // int temp = num1;
        // num1 = num2;
        // num2 = temp;

        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println("La valeur de num1 est " + num1);
        System.out.println("La valeur de num2 est " + num2);
    }
}
