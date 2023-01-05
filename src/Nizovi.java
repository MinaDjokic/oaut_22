public class Nizovi {

    public static void main(String[] args) {

        //niz je slozeni tip podatka
        //niz moze da prihvati i primitivne i slozene podatke, samo se menja tip niza

        int a = 5;
        int mojNiz [] = new int[5]; //prvi nacin za kreiranje niza, ovaj niz je sada prazan
        mojNiz[0]=15; //punjenje niza clanovima, kroz indekse


        int niz[] = new int[]{1,3,5,7,8,9}; //ovaj niz ne moze da primi vise clanova, ne moze da se menja

        for (int i=0; i< niz.length; i++) {
            System.out.println(niz[i]);
        } //ovako ce isprintati sve clanove niza

        System.out.println(niz);  //ovo ispisuje memorijsku lokaciju niza a ne niz

        String nizDnaUNedelji [] = new String[]{"Pon", "Uto", "sre"};

        for (int i:niz
             ) {
            System.out.println(i);
        }

        //domaci 2d niz pomocu for each petlje

        int [][] niz2d = new int[][]{
                {1,2,6},
                {5,7,2},
                {5,6,7}
        };

        System.out.println(niz2d[1][2]); //ovako dohvatamo broj dva iz drugog reda poslednji clan

        for (int i = 0; i<niz2d.length;i++){ //ovako printamo ceo 2d niz
            for (int j=0; j<niz2d.length;j++){
                System.out.println(niz2d[i][j]);
            }
            System.out.println();
        }

    }
}