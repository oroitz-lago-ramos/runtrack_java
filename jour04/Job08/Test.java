package jour04.Job08;

public class Test {
    public static void main(String[] args) {
        long result = 0;
        long timeStart = System.currentTimeMillis();
        for (int i = 1; i <= 10000000; i++) {
            result += i;
        }
        long timeEnd = System.currentTimeMillis();
        System.out.println("Temps d'exécution: " + (timeEnd - timeStart) + " ms");
        System.out.println("La somme de 1 à 10_000_000 est " + result);
    }
}
