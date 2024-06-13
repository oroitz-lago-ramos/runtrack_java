package jour03.Job05;

import java.util.HashSet;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] monTableau = {12,16,16,89,16};
        HashSet<Integer> uniques = new HashSet<Integer>();

        for (int num : monTableau) {
            uniques.add(num);
        }

        System.out.println("Les éléments uniques du tableau sont: " + uniques);

    }
}
