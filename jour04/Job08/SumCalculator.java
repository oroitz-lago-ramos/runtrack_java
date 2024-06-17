package jour04.Job08;

import java.util.ArrayList;
import java.util.List;

public class SumCalculator {

    private static final int NUM_THREADS = 10;

    public static void main(String[] args) {
        int upperLimit = 10_000_000;
        int blockSize = upperLimit / NUM_THREADS;

        List<SumThread> threads = new ArrayList<>();

        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < NUM_THREADS; i++) {
            int start = i * blockSize + 1;
            int end = (i == NUM_THREADS - 1) ? upperLimit : (start + blockSize - 1);
            SumThread thread = new SumThread(start, end);
            thread.start();
            threads.add(thread);
        }

        long totalSum = 0;
        for (SumThread thread : threads) {
            try {
                thread.join();
                totalSum += thread.getSum();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long timeEnd = System.currentTimeMillis();

        System.out.println("Temps d'exécution: " + (timeEnd - timeStart) + " ms");
        System.out.println("La somme de 1 à " + upperLimit + " est " + totalSum);
    }

    static class SumThread extends Thread {
        private final int start;
        private final int end;
        private long sum;

        public SumThread(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            for (int i = start; i <= end; i++) {
                sum += i;
            }
        }

        public long getSum() {
            return sum;
        }
    }
}