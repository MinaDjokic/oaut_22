import java.util.Arrays;

public class MinMaxClanoviNiza {
    public static void main(String[] args) {

        int[] niz = new int[] {56, 1, -13, 1002, -1002, 0}; //niz sa nabacanim vrednostima

        Arrays.sort(niz);  //soriranje niza
        System.out.println(Arrays.toString(niz));  //printanje celog sortiranog niza
        System.out.println(niz[0]);  //printanje najmanjeg clana niza
        System.out.println(niz[niz.length-1]);  //printanje najveceg clana niza
    }
}
