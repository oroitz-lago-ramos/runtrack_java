package jour04.Job03;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class RandomStringGenerator implements Runnable{
  private int length;
  private Object lock = new Object();

    public RandomStringGenerator(int length, Object lock) {
        this.length = length;
        this.lock = lock;
    } 

    @Override
    public void run() {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < this.length; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            sb.append(randomChar);
        }

        String randomString = sb.toString();

        synchronized (lock) {
            try {
                FileWriter writer = new FileWriter("jour04/Job03/output.txt", true); // append mode
                writer.write(randomString);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // System.out.println(sb.toString());
    }
}
