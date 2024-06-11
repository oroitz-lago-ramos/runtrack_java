package jour02.Job04;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if ((i & 1) == 1) {
                System.out.println("Le chiffre " + i + " est impair");
            } else {
                System.out.println("Le chiffre " + i + " est pair");
            }
        }
    }
}
