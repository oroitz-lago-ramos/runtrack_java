package jour01;

public class Facture {
    public static void main(String[] args) {
        double prix = 49.99;
        int quantite = 3;

        double tarifHT = prix * quantite;
        double tva = tarifHT * 0.2;
        double tarifTTC = tarifHT + tva;

        System.out.println("Prix unitaire : " + prix);
        System.out.println("Quantité : " + quantite);
        System.out.println("Tarif HT : " + tarifHT);
        System.out.println("TVA : " + tva);
        System.out.println("Tarif TTC : " + tarifTTC);
    }
}
