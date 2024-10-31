package praktikum7;

import java.util.Scanner;

public class Praktikum74 {
    
    public static void lingkaran(double nilainya){
        System.out.println("Luas lingkaran: " + nilainya);
    }
    public static void kelilingL(double kLingkarannya){
        System.out.println("Keliling lingkaran: " + kLingkarannya);
    }
    public static void luasSegitiga(double luasS){
        System.out.println("Luas segitiga sama kaki: " + luasS);
    }
    public static void kelilingS(double kelS){
        System.out.println("Keliling segitiga: " + kelS);
    }
    public static void panjangL(double Soal1Sama4Susah){
        System.out.println("Panjang L adalah: " + Soal1Sama4Susah);
    }
    
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double panjangSisi = 0, panjangL = 0, luasSegitiga = 0, kLingkaran = 0, kSegitiga = 0, radius= 0;
        boolean kondisi = true;
        int menu;
        
        do{
        System.out.println("Menu: ");
        System.out.println("1. Input nilai radius dan nilai panjang sisi");
        System.out.println("2. Hitung Luas dan Keliling Lingkaran");
        System.out.println("3. Hitung Luas dan Keliling Segitiga Sama Kaki");
        System.out.println("4. Hitung panjang L");
        System.out.println("5. Keluar");
        System.out.println("Pilih menu: ");
        menu = input.nextInt();

        if (menu == 1) {
            System.out.println("Input nilai radius:");
            radius = input.nextInt();
            System.out.println("Input nilai panjang sisi:");
            panjangSisi = input.nextInt();
        }
        do {
            System.out.println("Menu: ");
            System.out.println("1. Input nilai radius dan nilai panjang sisi");
            System.out.println("2. Hitung Luas dan Keliling Lingkaran");
            System.out.println("3. Hitung Luas dan Keliling Segitiga Sama Kaki");
            System.out.println("4. Hitung panjang L");
            System.out.println("5. Keluar");
            System.out.println("Pilih menu: ");
            menu = input.nextInt();
            
            if(menu == 2){
                double luas = 3.14 * (radius*radius);
                kLingkaran = (2 * 3.14) * radius;
                lingkaran(luas);
                kelilingL(kLingkaran);
            } else if(menu == 3){
                System.out.println("Masukkan alas segitiga: ");
                int alas = input.nextInt();
                System.out.println("Masukkan tinggi segitiga: ");
                int tinggi = input.nextInt();
                luasSegitiga = (alas / 2) * tinggi;
                kSegitiga = panjangSisi * 3;
                luasSegitiga(luasSegitiga);
                kelilingS(kSegitiga);
            } else if(menu == 4){
                System.out.println("Masukkan diameter: ");
                int diameter = input.nextInt();
                panjangL = (diameter * 2) + panjangSisi;
                panjangL(panjangL);
            }

        }while (menu >= 2 && menu < 5);
        if (menu >= 5){
            kondisi = false;
            System.out.println("Program berakhir");
        }
       }while (kondisi == true);
    }
}