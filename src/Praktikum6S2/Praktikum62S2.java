package Praktikum6S2;

import java.util.Scanner;

public class Praktikum62S2 {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan batasan atas deret fibonacci: ");
        int bil = scan.nextInt();
        System.out.println("Deret fibonacci: ");
        for (int i = 0; i < bil; i++) {
            System.out.print(fibonacci(i) + " ");
        }

    }
}
