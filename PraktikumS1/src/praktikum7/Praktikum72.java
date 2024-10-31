package praktikum7;

import java.util.Scanner;

public class Praktikum72 {

    public static void fibonacci(int bil) {
        int a = 1;
        int b = 1;
        if (bil == 1) {
            System.out.println("bukan bilangan Fibonacci");
            return;
        }
        int fibonacci = a + b;
        while (fibonacci <= bil) {
            if (fibonacci == bil) {
                System.out.println("bilangan fibonacci");
                return;
            }
            a = b;
            b = fibonacci;
            fibonacci = a + b;
        }
        System.out.println("bukan bilangan fibonacci");
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int angka, jenis = 0;

        System.out.println("Menentukan apakah suatu bilangan merupakan bilangan prima atau Fibonacci\n");
        System.out.println("Masukkan angka: ");
        angka = input.nextInt();

        for (int i = 2; i <= angka; i++) {
            if (angka % i == 0) {
                jenis++;
            }
        }

        if (jenis == 1) {
            System.out.println(angka + " merupakan bilangan prima dan");
        } else {
            System.out.println(angka + " bukan merupakan bilangan prima dan");
        }
        fibonacci(angka);

    }
}