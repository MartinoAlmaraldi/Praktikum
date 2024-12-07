package Praktikum6S2;

import java.util.Scanner;

public class Praktikum64S2 {
    public static int findMax(int[] array, int index, int currentMax, int maxIndex) {
        if (index == array.length) {
            return maxIndex;
        }

        if (array[index] > currentMax) {
            currentMax = array[index];
            maxIndex = index;
        }

        return findMax(array, index + 1, currentMax, maxIndex);
    }

    public static int findMin(int[] array, int index, int currentMin, int minIndex) {
        if (index == array.length) {
            return minIndex;
        }

        if (array[index] < currentMin) {
            currentMin = array[index];
            minIndex = index;
        }

        return findMin(array, index + 1, currentMin, minIndex);
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan panjang array: ");
        int length = scan.nextInt();
        int[] array = new int[length];

        System.out.print("Masukkan elemen array:");
        for (int i = 0; i < length; i++) {
            System.out.print("");
            array[i] = scan.nextInt();
        }

        boolean exit = false;
        while (!exit) {
            System.out.println("\nPilih operasi:");
            System.out.println("1. Cari bilangan terbesar");
            System.out.println("2. Cari bilangan terkecil");
            System.out.println("3. Keluar");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    int maxIndex = findMax(array, 0, Integer.MIN_VALUE, -1);
                    System.out.println("Bilangan terbesar: " + array[maxIndex] + " (berada di index ke-" + maxIndex + ")");
                    break;
                case 2:
                    int minIndex = findMin(array, 0, Integer.MAX_VALUE, -1);
                    System.out.println("Bilangan terkecil dalam array: " + array[minIndex] + " (berada di index ke-" + minIndex + ")");
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}