package praktikum8;

import java.util.Scanner;

public class praktikum82 {

    public static double luasL(double luasL) {
        return 3.14 * (luasL * luasL);
    }

    public static double luasS(double r, double tinggi) {
        return (3.14 * (r * 2)) * tinggi;
    }

    public static double permukaanT(double lingkaran, double r, double tinggi) {
        return 2 * luasL(lingkaran) + luasS(r, tinggi);
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int menu;
        double r = 0, tinggi = 0;

        do {
            System.out.println("Menu:\n1. Input jari-jari\n2. Input Tinggi\n3. Hitung Luas Lingkaran\n4. Hitung Luas Selimut Tabung\n5.Hitung Luas Permukaan Tabung\n6. Keluar");
            System.out.println("Pilih Menu:");
            menu = input.nextInt();
            
            
            switch(menu){
                case 1:
                    System.out.println("Masukkan nilai jari-jari:");
                    r = input.nextDouble();
                break;
                case 2:
                    System.out.println("Masukkan nilai tinggi:");
                    tinggi = input.nextDouble();
                break;
                case 3:
                    if (r == 0 || tinggi == 0){
                        System.out.println("Anda belum menginput Jari-jari atau Tinggi!");
                    }else if (tinggi == 0){
                        System.out.println(luasL(r));
                    }else{
                        System.out.println(luasL(r));
                    }
                break;
                case 4:
                    if (r == 0 && tinggi == 0){
                        System.out.println("Anda belum menginput Jari-jari atau Tinggi!");
                    } else{
                        System.out.println(luasS(r, tinggi));
                    }
                break;
                case 5:
                    if (r == 0 && tinggi == 0){
                        System.out.println("Anda belum menginput Jari-jari atau Tinggi!");
                    }else{
                        System.out.println(permukaanT(luasL(r), r, tinggi));
                    }
                break;
                
            }       
            
        }while (menu != 6);
            input.close();
        }
}

            