package Praktikum6S2;

import java.util.Scanner;

public class Praktikum61S2 {

    public static int faktorial(int a) {
        if (a == 0) {
            return 1;
        } else {
            return a * faktorial(a - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan bilangan: ");
        int bil = scan.nextInt();
        System.out.println("Faktorial dari " + bil + " adalah: " + faktorial(bil));

    }
}
