package Praktikum2S2;

import java.util.Scanner;

public class Praktikum24S2 {

    public static int cekTahun(int tahun) {
        if (tahun % 400 == 0) {
            System.out.println("Tahun " + tahun + " adalah tahun kabisat");
        } else if (tahun % 100 == 0){
            System.out.println("Tahun " + tahun + " bukan tahun kabisat");
        } else if (tahun % 4 == 0){
            System.out.println("Tahun " + tahun + " adalah tahun kabisat");
        } else {
            System.out.println("Tahun " + tahun + " bukan tahun kabisat");
        }
        return tahun;
    }
    
    public static void lanjut(){
        Scanner input = new Scanner (System.in);
        System.out.println("Lanjut input? y/n");
    }

    public static void keterangan() {
        Scanner input = new Scanner(System.in);
        System.out.println("Cek tahun kabisat");
        System.out.println("Masukkan tahun: ");
        
    }
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int tahun;
        String lanjut = "n";
        do{
        keterangan();
        tahun = input.nextInt();
        
        
        if (tahun > 0){
        cekTahun(tahun);
        } else {
            System.out.println("Tahun tidak bisa di bawah 0");
        }
        
        lanjut();
        input.nextLine();
        lanjut = input.nextLine();
        
        }while (lanjut.equalsIgnoreCase("y"));
    }
}
