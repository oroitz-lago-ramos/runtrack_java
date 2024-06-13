package jour03.Job01;

public class Main {
    public static void main(String[] args) {
        // Declare an array of 5 int
        int tableau[] = new int[5];
        tableau[0] = 10;
        tableau[2] = 2;
        tableau[4] = 69;

        System.out.println(tableau);
        System.out.println(tableau[1]);
        for (int num : tableau) {
            System.out.println(num);
        }
    }
}
