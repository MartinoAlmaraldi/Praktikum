package Praktikum5S2;

import java.util.Scanner;

public class Praktikum53S2{
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; //target ditemukan
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Target tidak ditemukan
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan angka-angka: ");
        String inputStr = scanner.nextLine();

        boolean isNumeric = inputStr.matches("\\d+(\\s+\\d+)*");
        if (isNumeric) {
            String[] inputArr = inputStr.split("\\s+");
            int[] intArray = new int[inputArr.length];

            System.out.println("Angka sebelum disort: ");
            for (int i = 0; i < inputArr.length; i++) {
                intArray[i] = Integer.parseInt(inputArr[i]);
                System.out.print(intArray[i] + " ");
            }
            System.out.println();
            selectionSort(intArray);

            System.out.println("Angka sesudah disort: ");
            for (int num : intArray) {
                System.out.print(num + " ");
            }
            System.out.println();

            System.out.println("Angka yang ingin dicari indexnya: ");
            int target = scanner.nextInt();

            int resultIndex = binarySearch(intArray, target);

            if (resultIndex != -1) {
                System.out.println("Angka " + target + " yang Anda cari berada di indeks ke-" + resultIndex);
            } else {
                System.out.println("Angka " + target + " tidak ditemukan");
            }
        } else {
            System.out.println("ERROR!");
        }
    }
}
