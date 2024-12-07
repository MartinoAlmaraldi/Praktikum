package Praktikum3S2;
import java.util.Scanner;
public class Praktikum32S2 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int index = 0, nilaiMin = 0;
        int i = 0;
        int minimum = Integer.MAX_VALUE;
        System.out.print("Panjang array: ");
        int panjang = input.nextInt();
        int[] arrpanjang = new int[panjang];

        for (i = 0; i < arrpanjang.length; i++) {
            System.out.print("Angka index ke-" + i + " : ");
            index = input.nextInt();
            arrpanjang[i] = index;
        }

        for (i = 0; i < arrpanjang.length; i++) {
            if (arrpanjang[i] < minimum) {
                minimum = arrpanjang[i];
                nilaiMin = i;
            }
        }

        System.out.println("Nilai minimum ada pada index ke-" + nilaiMin + " dengan nilai: " + minimum);

    }
}
