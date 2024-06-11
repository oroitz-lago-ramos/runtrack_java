package jour02.Job09;

public class Main {
    public static void main(String[] args) {
        int number = 1234;
        String numberStr = String.valueOf(number);
        System.out.println("Premier chiffre du nombre 1234: " + numberStr.charAt(0));
        System.out.println("Dernier chiffre du nombre 1234: " + numberStr.charAt(numberStr.length() - 1));
    }
}
