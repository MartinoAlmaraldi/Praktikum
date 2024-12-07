package Praktikum5S2;

import java.util.Scanner;
import java.util.ArrayList;

public class Praktikum51S2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data: ");
        int jumlah = input.nextInt();
        int[] arrData = new int[jumlah];
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Data ke-" + (i + 1) + " : ");
            arrData[i] = input.nextInt();
        }

        int tengah = arrData.length / 2;
        for (int i = 0; i < tengah; i++) {
            for (int j = 0; j < tengah - i - 1; j++) {
                if (arrData[j] > arrData[j + 1]) {
                    int temp = arrData[j];
                    arrData[j] = arrData[j + 1];
                    arrData[j + 1] = temp;
                }
            }
        }

        for (int i = tengah; i < arrData.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arrData.length; j++) {
                if (arrData[min] < arrData[j]) {
                    min = j;
                }
            }
            int temp = arrData[i];
            arrData[i] = arrData[min];
            arrData[min] = temp;
        }

        System.out.print("Hasil pengurutan: ");
        for (int i = 0; i < arrData.length; i++) {
            System.out.print(arrData[i] + " ");
        }
        System.out.println();
    }
}
