package Praktikum5S2;

import java.util.Scanner;

public class Praktikum54S2 {

    public static void bubbleSort(String array[]) {

        for (int j = 0; j < array.length - 1; j++) {
            for (int i = j + 1; i < array.length; i++) {
                if (array[j].compareTo(array[i]) > 0) {
                    String temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    public static int sequentialSearch(String[] arr, String target) {
        for (int i = 0; i < arr.length; i++) {
            if (target.equals(arr[i])) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan: ");
        String data = input.nextLine().toUpperCase();

        System.out.println("Masukan angka/huruf yang dicari : ");
        String cari = input.nextLine();

        String[] arrData = data.split("\\s+");
        bubbleSort(arrData);

        System.out.println("Huruf setelah disorting : ");
        for (String num : arrData) {
            System.out.print(num + " ");
        }
        System.out.println();
        int index = sequentialSearch(arrData, cari);
        if (!(index == -1)) {
            System.out.println(cari + " ditemukan pada index " + index + " dalam array");
        } else {
            System.out.println(cari + " tidak ditemukan dalam array");

        }
    }
}
