package jour03.Job08;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [][] tableau = {
            {5, 9, 3},
            {7, 2, 8},
            {1, 6, 4}
        };
        // Sorting the array

        int [] temp = new int[tableau.length * tableau[0].length];
        int k = 0;


        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                temp[k++] = tableau[i][j];
            }
        }

        // Sorting temp
        Arrays.sort(temp);

        // Reassigning the sorted values to the original array
        k = 0;
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                tableau[i][j] = temp[k++];
            }
        }

        // Printing the sorted array
        for (int i = 0; i < tableau.length; i++) {
            for (int j = 0; j < tableau[i].length; j++) {
                System.out.print(tableau[i][j] + " ");
            }
            System.out.println();
        }


    }
}
