package Praktikum5S2;

import java.util.Scanner;

public class Praktikum52S2 {

    public static void bubbleSort(char[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - i - 1; j++) {
                if (input[j] > input[j + 1]) {
                    char temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan input: ");
        String masukkan = input.nextLine();

        char[] dataChar = masukkan.replaceAll("\\s+", "").toCharArray();

        bubbleSort(dataChar);
        System.out.println("Output after Sorting: ");
        for (int i = 0; i < dataChar.length; i++) {
            System.out.print(dataChar[i]);
        }
    }
}
