

import java.util.Scanner;

public class Praktikum32 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int laptop, buku, kotak, smartphone;
        Double berat, beratLaptop, beratbuku, beratkotak, beratsmartphone;
        
        System.out.println("======== Indeks Berat Barang Bawaan Tasku ========");
        System.out.print("Banyak laptop: ");
        laptop = scan.nextInt();
        System.out.print("Banyak buku tulis: ");
        buku = scan.nextInt();
        System.out.print("Banyak kotak pensil: ");
        kotak = scan.nextInt();
        System.out.print("Banyak smartphone: ");
        smartphone = scan.nextInt();
        System.out.println("==================================================");
        
        beratLaptop = laptop*850.56;
        beratbuku = buku*250.11;
        beratkotak = kotak*25.31;
        beratsmartphone = smartphone*200.00;
        berat = beratLaptop + beratbuku + beratkotak + beratsmartphone;
        
        if(laptop <= 0 || buku <= 0 || kotak <= 0 || smartphone <= 0){
            System.out.println("ERROR - Tidak diperkenankan bilangan negatif!");
        }
        else if(berat < 2000){
            System.out.println("Indeks Berat Barang: 5");   
        }
        else if (berat > 1500 && berat < 2000){
            System.out.println("Indeks Berat Barang: 4");
        }
        else if (berat > 1000 && berat < 1500){
            System.out.println("Indeks Berat Barang: 3");
        }
        else if (berat > 500 && berat < 1000){
            System.out.println("Indeks Berat Barang: 2");
        }
        else if (berat > 0 && berat < 500){
            System.out.println("Indeks Berat Barang: 1");
        }
        else if (berat == 0){
            System.out.println("Indeks Berat Barang: 0");
        }
       
        else if(berat <= 2000){
            System.out.println("Berat bawaan tidak melebihi ketentuan");
        }
        else if(berat > 2000){
            System.out.println("Berat barang melebihi ketentuan");
        }
        
    }
    
}
