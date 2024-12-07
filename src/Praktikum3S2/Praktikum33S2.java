package Praktikum3S2;

import java.util.Scanner;

public class Praktikum33S2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Penjumlahan diagonal matrix");
        System.out.println("Panjang baris dan kolom: ");
        int panjang = input.nextInt();
        int[][] arrPanjang = new int[panjang][panjang];
        int jumlah = 0;

        for (int i = 0; i < arrPanjang.length; i++) {
            for (int j = 0; j < arrPanjang[i].length; j++) {
                System.out.println("Angka pada baris ke-" + i + " kolom-" + j + ": ");
                arrPanjang[i][j] = input.nextInt();
                
            }
        }
        
        System.out.println("Matrix: ");
        for (int i = 0; i < arrPanjang.length; i++) {
            for (int j = 0; j < arrPanjang[i].length; j++) {
                
                    System.out.print(arrPanjang[i][j] + " ");
                
            }
            System.out.println("");
        }
        
        for (int i = 0; i < arrPanjang.length; i++){
            jumlah += arrPanjang[i][i];
        }
        System.out.println("Jumlah diagonal : " + jumlah);
    }
}
