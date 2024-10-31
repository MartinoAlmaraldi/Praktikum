

import java.util.Scanner;
public class Praktikum33 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int barang,hadiah,cashback, jumlahbarang;
         
        
        System.out.println("=====Selamat Datang di Toko Charlie=====");
        System.out.print("Jumlah beli barang: ");
        barang = scan.nextInt();
        System.out.println("========================================");
       
        
        hadiah = barang / 3;
        cashback = barang / 7;
        jumlahbarang = hadiah + barang;
        
         if (barang <= 0) {
            System.out.println("ERROR - Inputan harus lebih dari 0");
            
         } else{
            System.out.print("Cashback: Rp");
             if (barang % 7 == 0){
            System.out.println(cashback * 5500);
            }
             else if (barang < 7)
                 System.out.println("-");
             else {
            System.out.println(cashback*5500);
            }
        
            System.out.print("Tambahan Barang: ");
            if (barang % 3 == 0){
            System.out.println(hadiah*1);
             }
            else if (barang < 3){
            System.out.println("-");
            }
            else{
                System.out.println(hadiah*1);
            }
            System.out.println("Jumlah Barang: " + jumlahbarang);
         }
    
        
    }
    
}
