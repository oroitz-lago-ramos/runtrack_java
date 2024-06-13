package jour03.Job03;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // String [] tab = {"Josette", "John", "Myrtille", "Marc"};
        // System.out.println(tab[1]);
        // tab[2] = "Mireille";

        // for (String name : tab) {
        //     System.out.println(name);
        // }
        ArrayList<String> tab = new ArrayList<String>(Arrays.asList("Josette", "John", "Myrtille", "Marc"));

        for (String name : tab) {
            System.out.println(name);
        }
        
        tab.set(2, "Mireille");

        for (String name : tab) {
            System.out.println(name);
        }
    }
}
