package jour04.Job02;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class RandomStringGenerator implements Runnable{
  private int length;

    public RandomStringGenerator(int length) {
        this.length = length;
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

        try {
            File file = new File("jour04/Job02/output.txt");
            if (!file.exists()) {
                file.createNewFile();
                }
            FileWriter writer = new FileWriter("jour04/Job02/output.txt");
            writer.write(randomString);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // System.out.println(sb.toString());
    }
}
