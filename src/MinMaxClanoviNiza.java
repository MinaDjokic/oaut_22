import java.util.Arrays;
import java.util.Random;

public class MinMaxClanoviNiza {
    public static void main(String[] args) {

        int[] niz = new int[]{56, 1, -13, 1002, -1002, 0}; //niz sa nabacanim vrednostima

        int maxElement = niz[0];
        int minElement = niz[0];

        for (int j = 0; j< niz.length;j++) {
            if (niz[j] > maxElement) {
                maxElement = niz[j];
            }
            if(niz[j] < minElement) {
                minElement = niz[j];
            }
        }
        /*Arrays.sort(niz);  //soriranje niza
        System.out.println("Sorted array: "+Arrays.toString(niz));*/
        System.out.println("Minimum is: "+minElement);
        System.out.println("Maximum is: "+maxElement);
        System.out.println();


        //ispisivanje 2d niza preko foreach petlje

        int[][] niz2d = new int[][]{
                {1, 2, 6, 4},
                {5, 7, 2, 1},
                {5, 6, 7, 3}
        };

        System.out.println("Resenje vezbe prikaza 2d niza sa forEach petljom:");
        for (int[] i : niz2d) {
            for (int h : i) {
                System.out.println(h); //ne znam da li je ovde trebalo da formatiram ispis kao tabelu
            }

        }
        System.out.println();

        //vezba 18
        System.out.println("Resenje vezbe 18");
        String[] someWords = new String[]{"Heart", "Cherry", "Coin", "Mellon", "Jocker"};
        System.out.println("Random combination is: ");
        new Random().ints(0, someWords.length-1).limit(5).forEach(i->System.out.println(someWords[i]));
        System.out.println();

        //vezba 19
        System.out.println("Resenje vezbe 19");
        String[] items = new String[]{"car", "bicycle", "mobile"};
        String[] types = new String[]{"Audi", "BMX", "Samsung"};
        double[] prices = new double[]{1000.32, 512.12, 23.46};

        for (int i=0; i< items.length; i++) {
            System.out.println(types[i] + " is a type of "+ items[i] + " and it costs " + prices[i]);
        }

    }
}