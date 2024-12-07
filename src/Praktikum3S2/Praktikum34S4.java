package Praktikum3S2;

public class Praktikum34S4 {

    public static void main(String args[]) {
        System.out.println("Array 1: ");
        int[][] array1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] array2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] hasil = new int[3][3];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Array 2: ");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Hasil perkalian antara baris dan kolom sama: ");
        for (int i = 0; i < hasil.length; i++) {
            for (int j = 0; j < hasil.length; j++) {
                hasil[i][j] += array1[i][j] * array2[i][j];
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
}
