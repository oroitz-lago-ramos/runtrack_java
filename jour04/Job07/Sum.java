package jour04.Job07;

public class Sum implements Runnable {
    private int[] numbers;
    private long result;

    public Sum(int [] numbers) {
        this.numbers = numbers;
        this.result = 0;
    }

    public long getResult() {
        return result;
    }

    @Override
    public void run() {
        for (int number : numbers) {
            result += number;
        }
    }
    
}
