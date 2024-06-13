package jour03.Job07;

public class Main {
    public static void main(String[] args) {
        int [][] matrice1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int [][] matrice2 = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        // Printing matrix1
        System.out.println("Matrix 1:");
        for (int i = 0; i < matrice1.length; i++) {
            for (int j = 0; j < matrice1[i].length; j++) {
                System.out.print(matrice1[i][j] + " ");
            }
            System.out.println();
        }

        // Adding matrix1 and matrix2
        int [][] result = new int[matrice1.length][matrice1[0].length];
        for (int i = 0; i < matrice1.length; i++) {
            for (int j = 0; j < matrice1[i].length; j++) {
                result[i][j] = matrice1[i][j] + matrice2[i][j];
            }
        }

        // Printing result
        System.out.println("\nMatrix 1 + Matrix 2:");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        // Using arrays
        
    }
}
