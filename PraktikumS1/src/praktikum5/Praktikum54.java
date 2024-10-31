package praktikum5;

import java.util.Scanner;

public class Praktikum54 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int banyak, a = 0, b = 0, c = 1;
        System.out.println("Banyak bilangan Fibonacci:");
        banyak = input.nextInt();
        for (int i = 1; i <= banyak; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.println(a + " ");
        }
    }

}
