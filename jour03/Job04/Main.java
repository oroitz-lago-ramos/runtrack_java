package jour03.Job04;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    // public static void main(String[] args) {
    //     int[] monTableau = { 3, 7, 3, 9, 8 };
    //     ArrayList<Integer> presents = new ArrayList<Integer>();
    //     for (int i = 0; i < monTableau.length; i++) {
    //         int test = monTableau[i];
    //         if (presents.contains(test)) {
    //             continue;
    //         }
    //         int count = 1;
    //         for (int j = 0; j < monTableau.length; j++) {
    //             if (i != j && test == monTableau[j]) {
    //                 count++;
    //             }
    //         }
    //         presents.add(test);
    //         System.out.println(test + " apparaît " + count + " fois");
    //     }
    // }
    public static void main(String[] args) {
        int[] monTableau = { 3, 7, 3, 9, 8 };
        HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for (int num : monTableau) {
            if (counts.containsKey(num)) {
                counts.put(num, counts.get(num) + 1);
            } else {
                counts.put(num, 1);
            }
        }
        for (int num : counts.keySet()) {
            System.out.println(num + " apparaît " + counts.get(num) + " fois");
        }
    }
}
