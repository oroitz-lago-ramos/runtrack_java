package jour02.Job10;

public class Main {
    public static void main(String[] args) {
        int num = 1234;
        String numStr = String.valueOf(num);
        int sum = 0;
        for (int i = 0; i < numStr.length(); i++)
        {
            char c = numStr.charAt(i);
            System.out.println((int)c);
            sum += Integer.parseInt(Character.toString(c));
        }
        System.out.println("La somme des chiffres du nombre 1234 est " + sum);
    }
}

// Easier way -> by copilot

/*
 * public class Main {
 *  public static void main(String[] args) {
 *      int num = 1234;
 *      int sum = 0;
 *      while (num > 0) {
 *          sum += num % 10;
 *          num /= 10;
 *      }
 *      System.out.println("La somme des chiffres du nombre 1234 est " + sum);
 *  }
 * }
 */