package praktikum8;

import java.util.Scanner;

public class praktikum83 {

    public static String lebih(int lebih) {
        return "Jumlah 3 suku pertama barisan Geometri tersebut adalah " + lebih;
    }

    public static String kurang(int kurang) {
        return "Jumlah 3 suku pertama barisan Geometri tersebut adalah " + kurang;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int r, n, hasil;
        System.out.println("Input a : ");
        a = input.nextInt();
        System.out.println("Input r : ");
        r = input.nextInt();
        System.out.println("Input n : ");
        n = input.nextInt();

        if (r > 1) {
            hasil = a * (r * (n * n) - 1) / r - 1;
            System.out.println(lebih(hasil));
        } else if (r < 1) {
            hasil = a * (1 - (r * (n * n))) / 1 - r;
            System.out.println(kurang(hasil));
        }
    }
}
