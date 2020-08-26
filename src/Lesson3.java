public class Lesson3 {


    public static void main(String[] args) {

        //ESIMENE

        /*int sumInt = sum(4,5);
        //System.out.println(sumInt);*/

        //TEINE HARD-CODE

        /*int[] m = {1,4,7,10};
        int sumMassiiv = sum(m);
        System.out.println("Massiivi summa on :"+sumMassiiv);*/

        //TEINE SCANNITUD MASSIIVI SUURUS JA TEMAS SISALDUVAD VÄÄRTUSED

        /*Scanner scanner = new Scanner(System.in);

        System.out.println("Sisesta massiivi pikkus");
        int massiiviSuurus = scanner.nextInt(); // MASSIIVI PIKKUS SIIT

        int[] m;
        m =new int[massiiviSuurus];

        System.out.println("Sisesta massiivi väärtused 0st kuni n elemendini");

        for (int i = 0; i < massiiviSuurus; i++) {
            System.out.println("Palun sisesta järgmine massiivi väärtus");
            int väärtus = scanner.nextInt();
            m[i] = väärtus;
        }
        int sumMassiiv = sum(m);
        System.out.println("Massiivi summa on :"+sumMassiiv);*/


        //KOLMAS

        int faktoriaal = factorial(12);
        System.out.println("Faktoriaal on : " + faktoriaal);

        //NELJAS







    }


    public static int sum(int x, int y) { //OK
        // TODO liida kokku ja tagasta x ja y väärtus
        return x + y;
    }

    public static int sum(int[] x) { //OK
        // Todo liida kokku kõik numbrid massivis x
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum = sum + x[i];
            //System.out.println("Summa on: "+sum);
        }
        return sum;
    }


    public static int factorial(int x) {
        // TODO tagasta x faktoriaal.
        int korrutis = 0;
        for (int i = x - 1; i > 0; i--) {
            if (korrutis == 0) {
                korrutis = i * x;
                System.out.println(korrutis);
            } else {
                korrutis = korrutis * i;
                System.out.println(korrutis);
            }
        }
        return korrutis;
    }


    // Näiteks
    // x = 5
    // return 4*3*2*1 = 24



    public static int[] sort(int[] a) {
        // TODO sorteeri massiiv suuruse järgi
        // Näiteks {2, 6, 8, 1}
        // Väljund {1, 2, 6, 8}
        return new int[0];
    }

    public static String reverseString(String a) {
        // TODO tagasta string tagurpidi
        // Näiteks:
        // a = "Test";
        // return tseT";
        return "";
    }

    public static boolean isPrime(int x) {
        // TODO tagasta kas sisestatud arv on primaar arv (jagub ainult 1 ja iseendaga)
        return false;
    }

}
