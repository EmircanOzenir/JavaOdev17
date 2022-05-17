import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long n, r, faktoriyelN=1, faktoriyelR=1, nFarkR=0, faktoriyelFark=1;
        double kombinasyon;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayiyi Giriniz: ");
        n = input.nextInt();
        System.out.print("Ikinci Sayiyi Giriniz: ");
        r = input.nextInt();

        for (int i = 1; i<=n; i++) {
            faktoriyelN = faktoriyelN * i;
        }

        for ( int k = 1; k<=r; k++) {
            faktoriyelR = faktoriyelR * k;
        }

        nFarkR = n-r;

        for ( int z=1; z<=nFarkR; z++ ) {
            faktoriyelFark = faktoriyelFark * z;
        }

        kombinasyon= faktoriyelN/(faktoriyelR*faktoriyelFark);

        System.out.println(kombinasyon);
    }
}
