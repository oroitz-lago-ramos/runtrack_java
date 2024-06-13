package jour03.Job02;

public class Main {
    public static void main(String[] args) {
        int [] monTableau = {12,6,76,89};

        afficherTableau(monTableau);

        modifierTableau(monTableau);
        afficherTableau(monTableau);
    }

    static void modifierTableau(int [] tableau) {
        tableau[0] = 0;
    }

    static void afficherTableau(int [] tableau) {
        System.out.println();
        System.out.print("[");
        for (int num : tableau) {
            System.out.print(num + ",");
            }
        System.out.print("]");
    }
}
