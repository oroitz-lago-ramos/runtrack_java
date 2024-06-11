package jour02.Job12;

public class Main {
    public static void main(String[] args) {
        // Calculate all combination of 3 dices of 6 faces
        int count = 0;
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                for (int k = 1; k <= 6; k++) {
                    count++;
                    System.out.println("Combinaison " + count + " - dé1: " + i + " dé2: " + j + " dé3: " + k);
                }
            }
        }
    }
}
